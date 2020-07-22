package com.itheima.注解的案例;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyTest {
        // 原有的@Test 也不需要添加任何的属性, 此时什么属性都不需要添加
}
