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
public class Test01_new {
    public static void main(String[] args) throws IOException {
        ArrayList<Student> arrayList = new ArrayList<>();
        arrayList.add(new Student("19901113", "麻少飞", "男", 29));
        arrayList.add(new Student("19960122", "张嘉敏", "女", 24));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("day01/stu2.txt"));
        for (Student student : arrayList) {
            bufferedWriter.write(student.getNumber() + ", " + student.getName() + ", " + student.getAge() + ", " + student.getGender());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();

        ArrayList<Student> arrayList1 = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("day01/stu2.txt"));
        String line;
        while ((line = bufferedReader.readLine()) != null){
            System.out.println(line);
            String[] info = line.split(",");
//            Student student = new Student(info[0], info[1], info[3], Integer.parseInt(info[2]));
//            arrayList1.add(student);
        }
        bufferedReader.close();
        System.out.println(arrayList1);
    }
}
