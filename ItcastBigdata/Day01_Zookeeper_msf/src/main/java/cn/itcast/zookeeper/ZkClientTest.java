package cn.itcast.zookeeper;

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

import javax.swing.*;

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

    @Test//创建节点：【增】【增加一个持久化节点】
    public void createZnode() throws Exception {

        //todo:1-构建地址
        RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000,7);
        CuratorFramework client = CuratorFrameworkFactory.newClient("jq1:2181,jq2:2181,jq3:2181,jq4:2181,jq5:2181", retryPolicy);
        client.start();

        //todo:2-实现操作：增加一个持久化节点
        client.create().creatingParentsIfNeeded().withMode(CreateMode.PERSISTENT).forPath("/zjm","zhangjiamin".getBytes());
//        client.create().creatingParentContainersIfNeeded().withMode(CreateMode.EPHEMERAL).forPath("/zjm", "zhangjiamin".getBytes());
//        Thread.sleep(7000);

        //todo:3-释放连接
        client.close();

    }
    @Test//创建节点：【增2】【增加一个临时节点】
    public void createZnode2() throws Exception {

        //todo:1-构建地址
        RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000,7);
        CuratorFramework client = CuratorFrameworkFactory.newClient("jq1:2181,jq2:2181,jq3:2181,jq4:2181,jq5:2181", retryPolicy);
        client.start();

        //todo:2-实现操作：增加一个临时节点
        client.create().creatingParentContainersIfNeeded().withMode(CreateMode.EPHEMERAL).forPath("/zjm", "zhangjiamin".getBytes());
        Thread.sleep(7000);

        //todo:3-释放连接
        client.close();

    }

    @Test//获取节点的数据：【查】
    public void getZnodeData() throws Exception {

        //todo:1-构建地址
        RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000,7);
        CuratorFramework client = CuratorFrameworkFactory.newClient("jq1:2181,jq2:2181,jq3:2181,jq4:2181,jq5:2181", retryPolicy);
        client.start();

        //todo:2-实现操作
        byte[] datas = client.getData().forPath("/msf");
        System.out.println(new String(datas));

        //todo:3-释放连接
        client.close();
    }

    @Test//修改节点的值:【改】
    public void setZnodeData() throws Exception {

        //todo:1-构建地址
        RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000,7);
        CuratorFramework client = CuratorFrameworkFactory.newClient("jq1:2181,jq2:2181,jq3:2181,jq4:2181,jq5:2181", retryPolicy);
        client.start();

        //todo:2-实现操作
        client.setData().forPath("/msf", "msflovezjm".getBytes());
//        client.setData().forPath("/msf", "mashaofei".getBytes());

        //todo:3-释放连接
        client.close();

    }
    @Test//修改节点的值:【改回去】
    public void setZnodeData2() throws Exception {

        //todo:1-构建地址
        RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000,7);
        CuratorFramework client = CuratorFrameworkFactory.newClient("jq1:2181,jq2:2181,jq3:2181,jq4:2181,jq5:2181", retryPolicy);
        client.start();

        //todo:2-实现操作
        client.setData().forPath("/msf", "mashaofei".getBytes());

        //todo:3-释放连接
        client.close();

    }

    @Test //实现监听:【改】
    public void setZnodeWatch() throws Exception {

        //todo:1-构建地址
        RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000,7);
        CuratorFramework client = CuratorFrameworkFactory.newClient("jq1:2181,jq2:2181,jq3:2181,jq4:2181,jq5:2181", retryPolicy);
        client.start();

        //todo:2-实现操作
        TreeCache treeCache = new TreeCache(client, "/msf");
        treeCache.getListenable().addListener(new TreeCacheListener() {
            @Override
            public void childEvent(CuratorFramework framework, TreeCacheEvent event) throws Exception {
                ChildData data = event.getData();
                if(data != null) {
                    switch (event.getType()) {
                        case NODE_ADDED://【添加】
                            System.out.println("NODE_ADDED(添加)：" + data.getPath() + " 数据：" + new String(data.getData()));
                            break;
                        case NODE_UPDATED://【更新】
                            System.out.println("NODE_UPDATED(更新)：" + data.getPath() + " 数据：" + new String(data.getData()));
                            break;
                        case NODE_REMOVED://【删除】
                            System.out.println("NODE_REMOVED(删除)：" + data.getPath() + " 数据：" + new String(data.getData()));
                            break;
                        default:
                            break;

                    }
                } else {
                    System.out.println("Data is null(数据为空)：" + event.getType());

                }
            }
        });
        //开启监听
        treeCache.start();
        Thread.sleep(7777777);
        //关闭监听
        treeCache.close();
        //todo:3-释放连接
        client.close();

    }
}
