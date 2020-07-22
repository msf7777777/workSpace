package bigdata.itcast.cn.zookeeper;

import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.framework.recipes.cache.ChildData;
import org.apache.curator.framework.recipes.cache.TreeCache;
import org.apache.curator.framework.recipes.cache.TreeCacheEvent;
import org.apache.curator.framework.recipes.cache.TreeCacheListener;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.zookeeper.CreateMode;
import org.junit.Test;

/**
 * @ClassName ZkClientTest
 * @Description TODO 实现自定义开发Zookeeper的JavaAPI
 *  创建节点
 *  查看数据
 *  修改数据
 *  设置监听
 * @Date 2020/5/25 11:40
 * @Create By     Frank
 */
public class ZkClientTest {

    /**
     * 创建节点
     */
    //【增】【增】【增】【增】【增】【增】【增】
    @Test
    public void createZnode() throws Exception {
        //todo:1-构建连接
        //参数1：zookeeper的地址,可以写一台的地址，也可以写多台，用逗号隔开即可，也只连接一台，如果一台连接不上，会连接其他的
        //参数2：重试的机制
        RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000,5);//第一个参数代表重试的间隔时间,第二个参数表示重试的次数
        //如果你们的Windows上没有配置Linux机器名称的映射，你们这里写IP地址
        //如何设置映射
        // Linux 上的映射：/etc/hosts
        // windows上的映射：C:\Windows\System32\drivers\etc\hosts
        CuratorFramework client = CuratorFrameworkFactory.newClient("jq1:2181,jq2:2181,jq3:2181,jq4:2181,jq5:2181", retryPolicy);
        //启动客户端连接
        client.start();
        //todo:2-实现操作
        //创建一个持久节点,creatingParentsIfNeeded：如果父节点不存在，先创建父节点
        //withMode：指定节点类型
//        client.create().creatingParentsIfNeeded().withMode(CreateMode.PERSISTENT).forPath("/itcast","My name is Tom".getBytes());
        client.create().creatingParentsIfNeeded().withMode(CreateMode.EPHEMERAL).forPath("/hadoop","hadoop".getBytes());
        //线程停留5s
        Thread.sleep(5000);
        //todo:3-释放连接
        client.close();
    }

    /**
     * 获取节点的数据
     */
    //【查】【查】【查】【查】【查】【查】【查】
    @Test
    public void getZnodeData() throws Exception {
        //todo:1-构建连接
        RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000,5);
        CuratorFramework client = CuratorFrameworkFactory.newClient("node-01:2181,node-02:2181,node-03:2181", retryPolicy);
        client.start();
        //todo:2-实现操作
        //获取对应节点的数据
        byte[] datas = client.getData().forPath("/itcast");
        //打印在控制台
        System.out.println(new String(datas));
        //todo:3-释放连接
        client.close();
    }


    /**
     * 修改节点的值
     */
    //【改】【改】【改】【改】【改】【改】【改】
    @Test
    public void setZnodeData() throws Exception {
        //todo:1-构建连接
        RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000,5);
        CuratorFramework client = CuratorFrameworkFactory.newClient("node-01:2181,node-02:2181,node-03:2181", retryPolicy);
        client.start();
        //todo:2-实现操作
        //修改节点的值
        client.setData().forPath("/itcast","My name is heima".getBytes());
        //todo:3-释放连接
        client.close();
    }

    /**
     * 实现监听
     * @throws Exception
     */
    @Test
    public void setZnodeWatch() throws Exception {
        //todo:1-构建连接
        RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000,5);
        CuratorFramework client = CuratorFrameworkFactory.newClient("node-01:2181,node-02:2181,node-03:2181", retryPolicy);
        client.start();
        //todo:2-实现操作
        //构建一个监听器：JavaAPI中的监听是循环持久的，不同于Linux命令行中的监听是一次性的
        TreeCache treeCache = new TreeCache(client,"/itcast");
        //获取触发的监听
        treeCache.getListenable().addListener(new TreeCacheListener() {
            //对每次触发的监听进行处理
            //第一个参数就是客户端
            //第二个参数是触发的监听的事件
            @Override
            public void childEvent(CuratorFramework client, TreeCacheEvent event) throws Exception {
                //先获取监听到的事件的数据
                ChildData data = event.getData();
                //判断到底是哪一种操作触发了监听
                if(data != null){
                    switch (event.getType()){
                        case NODE_ADDED:
                            //打印详细的信息
                            System.out.println("NODE_ADDED："+data.getPath()+"数据："+ new String(data.getData()));
                            break;
                        case NODE_UPDATED:
                            System.out.println("NODE_UPDATED："+data.getPath()+"数据："+ new String(data.getData()));
                            break;
                        case NODE_REMOVED:
                            System.out.println("NODE_REMOVED："+data.getPath()+"数据："+ new String(data.getData()));
                            break;
                        default:
                            break;

                    }
                }else{
                    System.out.println("Data is null ："+event.getType());
                }
            }
        });
        //开启监听
        treeCache.start();
        Thread.sleep(10000000000000L);
        //关闭监听
        treeCache.close();
        //todo:3-释放连接
        client.close();
    }

}
