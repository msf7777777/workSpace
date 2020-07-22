package cn.itcast.c_scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//需求1：将当前类交给 spring 管理
//@Component 代替 <bean id="singletonBean" class="cn.itcast.c_scope.SingletonBean"/>
@Component
//需求2：每次从 spring 容器中获取的是同一个对象
//<bean id="singletonBean" class="cn.itcast.c_scope.SingletonBean" scope="singleton"/>
@Scope("singleton")
public class SingletonBean {
}
