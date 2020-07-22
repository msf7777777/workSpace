package cn.itcast.c_scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// 需求1: 将当前类交给spring容器管理
// <bean id="singletonBean" class="cn.itcast.c_scope.PrototypeBean"/>
@Component
// 需求2: 每次从spring容器获取的都是新的对象
// <bean id="singletonBean" class="cn.itcast.c_scope.SingletonBean" scope="prototype"/>
@Scope("prototype")
public class PrototypeBean {
}
