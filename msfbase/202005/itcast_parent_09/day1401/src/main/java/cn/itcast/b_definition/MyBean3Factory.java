package cn.itcast.b_definition;

import org.springframework.beans.factory.FactoryBean;

public class MyBean3Factory implements FactoryBean<Bean3> {
    @Override
    public Bean3 getObject() throws Exception {
        return new Bean3();
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
