package cn.itcast.task.homework.test01;

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
        //1.定义集合
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student("itcast001", "梅军建", 18, "男"));
        al.add(new Student("itcast002", "君君", 18, "男"));
        al.add(new Student("itcast003", "渐渐", 18, "男"));
        al.add(new Student("itcast004", "美眉", 18, "女"));
        //2.将集合中的学生对象的信息保存到当前模块下的stu.txt中 -----> 输出流, BufferedWriter
        BufferedWriter bw = new BufferedWriter(new FileWriter("day02/stu.txt"));
        //3.遍历集合
        for (Student student : al) {
            //bw.write(student.getId()+","+student.getName()+","+ student.getGender()+","+ student.getAge());
            bw.write(student.show());
            //记得换一行
            bw.newLine();
        }
        //4.记得关闭资源
        bw.close();
        //2.将stu.txt学生信息读取出来,将每一行封装成一个学生对象, 然后将封装好的学生对象放入集合中
        //BufferedReader可以实现一次读一行!!!!
        ArrayList<Student> list = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("day02/stu.txt"));
        String line;
        while((line = br.readLine())!=null){//itcast001,梅军建,男,18
            //1.将line进行切割
            String[] info = line.split(",");
            //2.将零散的信息封装成一个学会对象
            Student student = new Student(info[0],info[1],Integer.parseInt(info[3]),info[2]);
            list.add(student);
        }

        //3.释放资源
        br.close();
        //4.打印集合
        System.out.println(list);




    }
}
