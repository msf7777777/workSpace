package cn.itcast.b_definition;

import org.springframework.beans.factory.FactoryBean;

public class MyBean4Factory implements FactoryBean<Bean4> {
    @Override
    public Bean4 getObject() throws Exception {
        return new Bean4();
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
