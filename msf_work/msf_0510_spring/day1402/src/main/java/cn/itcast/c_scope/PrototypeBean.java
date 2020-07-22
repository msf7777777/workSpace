package cn.itcast.c_scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//需求1：将当前类交给 spring 管理
//@Component 代替 <bean id="prototypeBean" class="cn.itcast.c_scope.PrototypeBean"/>
@Component
//需求2：每次从 spring 容器中获取的都是新的对象
//<bean id="prototypeBean" class="cn.itcast.c_scope.PrototypeBean" scope="prototype"/>
@Scope("prototype")
public class PrototypeBean {
}
