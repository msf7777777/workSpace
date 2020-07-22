package com.itheima.反射;


public class Person {

    private String  name ;
    private  int  password;
    public int age ;

    public Person() {
    }

    public Person(String name, int password, int age) {
        this.name = name;
        this.password = password;
        this.age = age;
    }

    private Person(String name, int password) {
        this.name = name;
        this.password = password;
    }



    public void  eat(){
        System.out.println("人要吃饭");
    }
    public void  run(String  name){
        System.out.println(name +"人要锻炼身体....");
    }
    private  void study (){
        System.out.println("人人都爱学习....");
    }
}
