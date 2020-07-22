package cn.itcast.task.task01;

import java.io.*;
import java.util.ArrayList;

/*
第一题:
	定义学生类,包含:学号(String),姓名(String),性别(String),年龄(int);
	1.定义集合存放学生对象, 自己创建若干个学生对象存入, 将集合中的学生对象的信息保存到当前模块下的stu.txt中
	  要求格式为: (学号,姓名,性别,年龄) , 每个学生信息占一行
	2.将stu.txt学生信息读取出来,将每一行封装成一个学生对象, 然后将封装好的学生对象放入集合中
 */
public class Test01 {

    public static void main(String[] args) throws IOException {
        //1.创建俩学生对象
        Student studentM = new Student("19901113", "麻少飞", "男", 29);
        Student studentZ = new Student("19960122", "张嘉敏", "女", 23);
        //2.定义集合存放学生对象
        ArrayList<Student> arrayList = new ArrayList();
        arrayList.add(studentM);
        arrayList.add(studentZ);
        arrayList.add(new Student("20000225", "韩卓君", "女", 20));
        //3.创建输出流关联本模块儿下的 stu.txt
//        System.out.println(studentM);
//        System.out.println(studentZ);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("day01/stu.txt"));
        bufferedWriter.write(studentM.toString());
        bufferedWriter.newLine();
        bufferedWriter.write(studentZ.toString());
        bufferedWriter.close();
        //4.将stu.txt学生信息读取出来,将每一行封装成一个学生对象, 然后将封装好的学生对象放入集合中
        BufferedReader bufferedReader = new BufferedReader(new FileReader("day01/stu.txt"));
        String line;
        System.out.println("将stu.txt学生信息读取出来");
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
        }
        bufferedReader.close();
    }
}
