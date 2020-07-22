package com.itheima.注解;

public @interface Book {

    /*

    String  value()  -- 书的名称
    double  price()  -- 书的价格
    String[]  author() -- 书中的人物 (可以有多个)

     */
    String value();
    double price() default  200;
    String[] author() default {};

}
