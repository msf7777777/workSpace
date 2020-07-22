package cn.itcast.c_scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// 需求1: 将当前类交给spring容器管理
// <bean id="singletonBean" class="cn.itcast.c_scope.SingletonBean"/>
@Component
// 需求2: 每次从spring容器获取的是同一个对象
// <bean id="singletonBean" class="cn.itcast.c_scope.SingletonBean" scope="singleton"/>
@Scope("singleton")
public class SingletonBean {
}
