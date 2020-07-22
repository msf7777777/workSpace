package cn.itcast.code.util;

import cn.itcast.code.domain.Person;
import cn.itcast.code.domain.Student;

import java.io.*;
import java.util.ArrayList;

public class Utils {

    public static int stuId;
    public static int teaId;

    //在程序加载时候, 我们需要动态的读取硬盘上存入的id来给Util中的id赋值!!,这个动作只需要执行一次
    static {//静态代码块, 特点: 随着类的加载而加载只会执行一次!!!
        //目的: 让我们的id每次启动的时候的都是从上一次的id开始!!!!!!!!
        try {
            BufferedReader reader = new BufferedReader(new FileReader("day02/ids.txt"));
            Utils.stuId = Integer.parseInt(reader.readLine());
            Utils.teaId = Integer.parseInt(reader.readLine());
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //id可以动态获取, 但是id一旦发生变化, 也要存到文件中
    public static void storeId2File(String path) throws IOException {
        //目的: 动态的将我们最新的id保存到硬盘上!!!!!!!!
        // 不是以续写的方式关联路径, 会清空内容的!!!!!!!!
        BufferedWriter bw = new BufferedWriter(new FileWriter(path));
        bw.write(stuId + "");//
        bw.newLine();
        bw.write(teaId + "");//
        bw.newLine();
        bw.close();
    }


    //将集合数据保存到指定文件中, 我们? extends Person 对集合的泛型进行了限定,我的方法扩展性提高了
    public static void store2File(ArrayList<Student> stuList, String path) throws IOException {
        //目的: 将集合中的学生信息保存到文件中, 让我们下一次程序启动的时候能够找到上一次的学生信息
        //1.创建输出流关联path
        BufferedWriter bw = new BufferedWriter(new FileWriter(path));
        //2.遍历集合,得到每一个数据
        for (Person student : stuList) {
            bw.write(student.getId() + "," + student.getName() + "," + student.getAge() + "," + student.getGender());
            //3.每一个学员独占一行
            bw.newLine();
        }
        //4.关闭资源
        bw.close();
    }

    //将指定文件中数据得到集合中 ---> 将学生读到集合中, 也可以将老师读到集合中
    public static void load2List(ArrayList<Student> stuList, String path) throws IOException {
        //目的: 程序开始的时候, 将以前的学生信息读到集合中!!!!!!
        BufferedReader br = new BufferedReader(new FileReader(path));
        //不断的读取每一行数据
        String line;
        while ((line = br.readLine()) != null) {
            //将line用,切割
            String[] info = line.split(",");
            //将info中的数据封装成学生对象装入集合返回

            Student student = new Student(Integer.parseInt(info[0]), info[1], Integer.parseInt(info[2]), info[3]);
            stuList.add(student);
        }
        br.close();

    }

    // 将来我们有打印学生的需求, 也有打印老师需求
    // 泛型通配符适用于参数里面有泛型,我们需要限定的时候需要使用
    /*
        目的: 打印学生信息!!!!
     */
    public static void printList(ArrayList<Student> list) {//
        //加上表头
        System.out.println("************************------------************************");
        System.out.println("学号\t姓名\t年龄\t性别\t工作");
        for (Student student : list) {
            System.out.println(student.show());
        }
        System.out.println("************************------------************************");
    }
}
