package cn.itcast.bigdata.hdfs;


import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.*;
import org.apache.hadoop.hdfs.DistributedFileSystem;
import org.apache.hadoop.hdfs.protocol.DatanodeInfo;
import org.apache.hadoop.io.IOUtils;
import org.junit.Test;

/**
 * @ClassName HDFSClientTest
 * @Description TODO 实现基于HDFS 的API构建Java Client
 * @Date 2020/5/28 14:45
 * @Create By     Frank
 */
public class HDFSClientTest {

    /**
     * 用于获取一个文件系统对象
     */
    public FileSystem getHdfs() throws Exception {
        //构建一个Configuration对象
        //请注意：Configuration对象用于记录当前程序的所有配置，所有的Hadoop程序都必须包含该对象
        //这个对象在进行初始化时会从jar包中加载所有*-default.xml文件，读取所有的默认配置
        //这个对象会读取*-site.xml，加载用户自定义的所有配置
        Configuration conf = new Configuration();
        //必须指定hdfs的地址，不然无法请求
        //方案一：将core-site.xml放入当前程序的环境变量，将core-site放入resource目录中
        //方案二：在conf对象中手动指定
        //获取一个hdfs的对象
        conf.set("fs.defaultFS","hdfs://jq1:8020");
        //构建了hdfs的连接客户端
//        FileSystem hdfs = FileSystem.get(conf);
//        FileSystem hdfs = FileSystem.get(new URI("hdfs://node-01:8020"),conf);
        FileSystem hdfs = FileSystem.newInstance(conf);
//        System.out.println(hdfs);
        //释放连接
//        hdfs.close();
        return hdfs;
    }

    /**
     * 打印集群状态
     * @throws Exception
     */
    @Test
    public void getClusterInfo() throws Exception {
        //得到一个分布式文件系统：集群的管理操作必须转为一个分布式文件系统对象
        DistributedFileSystem hdfs = (DistributedFileSystem) getHdfs();
        //获取集群的状态信息
        DatanodeInfo[] dataNodeStats = hdfs.getDataNodeStats();
        //迭代输出
        for (DatanodeInfo dataNodeStat : dataNodeStats) {
            //打印每一台datanode的信息
            System.out.println(dataNodeStat.getDatanodeReport());
        }
    }

    /**
     * 在hdfs上创建目录
     * @throws Exception
     */
    @Test
    public void createHDFSdir() throws Exception {
        FileSystem hdfs = getHdfs();
        //构建要创建的目录的路径
        Path path = new Path("/hdfsClient");
        //判断目录是否存在，如果已存在，就先删除，再创建，如果不存在，就直接创建
        if(hdfs.exists(path)){
            //先删除
            hdfs.delete(path,true);//第一个参数表示要删除的文件或者目录，第二个参数表示是否递归
            //然后创建
            hdfs.mkdirs(path);
        }else{
            //不存在就直接创建
            hdfs.mkdirs(path);
        }
        //释放连接
        hdfs.close();
    }

    /**
     * 上传本地文件到HDFS
     * @throws Exception
     */
    @Test
    public void uploadToHdfs() throws Exception {
        FileSystem hdfs = getHdfs();
        //创建本地路径:Windows文件路径
        Path inputPath = new Path("file:///E:\\output\\test1.txt");//HDFS文件系统操作本地路径需要加file:///
        //创建目标路径：HDFS路径
        Path  outputPath = new Path("/hdfsClient");
        //调用上传文件的方法,从本地【Windows】拷贝一份上传到HDFS
        hdfs.copyFromLocalFile(inputPath,outputPath);
        //释放连接
        hdfs.close();
    }

    /**
     * 下载HDFS的文件到本地
     * @throws Exception
     */
    @Test
    public void downloadFromHDFS() throws Exception {
        FileSystem hdfs = getHdfs();
        //创建本地输出路径:Windows文件路径
        Path outputPath = new Path("file:///E:\\output");//HDFS文件系统操作本地路径需要加file:///
        //创建输入路径：HDFS路径
        Path  inputPath = new Path("/wordcount/input/wordcount.txt");
        //调用下载的方法，从HDFS下载到本地【Windows】,尽量不要写C盘
        hdfs.copyToLocalFile(inputPath,outputPath);
        //释放资源
        hdfs.close();
    }

    /**
     * 列举hdfs上的目录结构
     * @throws Exception
     */
    @Test
    public void listHdfs() throws Exception {
        FileSystem hdfs = getHdfs();
        //列举某个目录下的文件或者目录
//        FileStatus[] fileStatuses = hdfs.listStatus(new Path("/wordcount/input"));
//        //迭代输出
//        for (FileStatus fileStatus : fileStatuses) {
//            //对每个文件进行输出
//            if(hdfs.isDirectory(fileStatus.getPath())){
//                System.out.println(fileStatus.getPath()+"\t"+"这是一个目录");
//            }else{
//                System.out.println(fileStatus.getPath()+"\t"+"这是一个文件");
//            }
//        }
        //列举某个目录下所有的文件，可以递归
        RemoteIterator<LocatedFileStatus> locatedFileStatusRemoteIterator = hdfs.listFiles(new Path("/"), true);
        //迭代输出
        while (locatedFileStatusRemoteIterator.hasNext()){
            //获取每一个文件对象
            LocatedFileStatus next = locatedFileStatusRemoteIterator.next();
            //输出文件对象的路径
            System.out.println(next.getPath());
        }
        //释放资源
        hdfs.close();
    }

    /**
     * 将本地多个文件进行合并，写入HDFS中的一个文件
     * @throws Exception
     */
    @Test
    public void mergeUpload() throws Exception {
        //获取hdfs的对象
        FileSystem hdfs = getHdfs();
        //获取一个本地文件的对象
        LocalFileSystem local = FileSystem.getLocal(new Configuration());
        //将HDFS上的文件打开，构建一个输出流
        FSDataOutputStream outputStream = hdfs.create(new Path("/hdfsClient/merge.txt"));
        //打开本地文件系统的两个文件，放入输入流
        FileStatus[] fileStatuses = local.listStatus(new Path("E:\\output\\merge"));
        for (FileStatus fileStatus : fileStatuses) {
            //打开每个文件
            FSDataInputStream inputStream = local.open(fileStatus.getPath());
            //将输入流的数据写入输出流
            IOUtils.copyBytes(inputStream,outputStream,4096);
            //关闭输入流
            IOUtils.closeStream(inputStream);
        }
        //关闭输出流
        IOUtils.closeStream(outputStream);
        //释放连接
        local.close();
        hdfs.close();
    }
}
