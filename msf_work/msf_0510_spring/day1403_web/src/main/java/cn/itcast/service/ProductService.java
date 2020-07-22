package cn.itcast.service;

public interface ProductService {

    /**
     * 查询所有
     */

    public void queryAll();

    /**
     * 新增商品
     */
    public void insertProduct();

    /**
     * 修改商品
     */
    public void updateProduct();

    /**
     * 根据编号删除商品
     */
    public void delById();
}
