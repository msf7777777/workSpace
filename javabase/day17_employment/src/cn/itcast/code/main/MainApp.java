package cn.itcast.code.main;

import cn.itcast.code.domain.Student;
import cn.itcast.code.domain.Teacher;
import cn.itcast.code.util.Utils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
    启动界面
 */
public class MainApp {
    //静态创建集合(这里不推荐)
    public static void main(String[] args) throws IOException {//alt + ctrl + t
        //创建集合
        ArrayList<Student> stuList = new ArrayList<>();
        //将文件中保存的原来的学生信息加载到集合中
        Utils.load2List(stuList, "day17/stu.txt");
        ArrayList<Teacher> teaList = new ArrayList<>();
       // Utils.load2List(teaList, "day17/stu.txt",Teacher.class);

        //int stuId = 0;//不可以!!!!!因为基本数据类型形参的改变不会影响实参
        main_menu:  while (true) {
            //1.先准备主菜单
            System.out.println("【欢迎进入主菜单】");
            System.out.println("请输入序号进入对应的选项");
            System.out.println("1.进入学员系统\t2.进入教师系统\t3.退出系统");
            //2.准备键盘录入对象
            Scanner scanner = new Scanner(System.in);
            String choose = scanner.next();//建议大家都接受成字符串, 因为nextInt和next或者nextLine
            switch (choose) {
                case "1":// 进入学员管理系统
                    studentManage(scanner,stuList);//alt + enter
                    break;
                case "2"://进入老师管理系统
                    teacherManage();
                    break;
                case "3":
                    //需要退出系统 1.暴力退出(直接将jvm关闭) 2.给循环起标号 3.return(结束方法)
                    System.out.println("谢谢使用!!!欢迎下次光临!!!");
                    //System.exit(0);
                    break main_menu;
                // return;
                default:
                    System.out.println("您输入的序号有问题");
                    break;
            }
        }
    }

    private static void teacherManage() {
    }

    //方法和方法中的局部变量想要通信, 则需要传参!!!!!
    private static void studentManage(Scanner sc,ArrayList<Student > stuList) throws IOException {
        student_menu:while (true) {
            //准备学员菜单
            System.out.println("【欢迎进入学员管理界面】");
            System.out.println("请输入序号进入对应的选项");
            System.out.println("1.添加学员\t2.删除学员\t3.修改学员\t4.查询学员\t5.退出");
            String choose = sc.next();
            switch (choose) {
                case "1":
                    addStudent(sc,stuList);
                    break;
                case "2":
                    deleteStudent(sc,stuList);
                    break;
                case "3":
                    updateStudent(sc,stuList);
                    break;
                case "4":
                    selectStudent(stuList);
                    break;
                case "5"://退出学员菜单
                    System.out.println("【退出学员菜单】");
                    break student_menu;
                default:// 输错的, 我们应该让他继续去选择!!!!
                    System.out.println("你输入的序号有问题!!!");
                    break;
            }
        }

    }

    private static void selectStudent(ArrayList<Student > stuList) {
        //有结果(展示数据), 没结果(提醒展示没有学员可供查询)
        if(stuList.size() == 0){
            //没有学生
            System.out.println("【没有学员可供查询】");
        }else{
            Utils.printList(stuList);
        }
    }

    private static void updateStudent(Scanner sc,ArrayList<Student > stuList) throws IOException {
        if(stuList.size() == 0){
            System.out.println("【没有学员可供修改,别瞎搞, 小心打你屁屁!!!】");
        }else{
            selectStudent(stuList);
            System.out.println("----------------------");
            System.out.println("请输入要修改的学生的学号");
            int id = Integer.parseInt(sc.next());
            //查询修改的id对应的学生是否存在的问题
            int index = selectIndexFromArrayList(stuList, id);
            if(index == -1){
                System.out.println("【你好修改的学生对应的id不存在!!!】");
            }else{
                Student student = stuList.get(index);//找到原来的学生!!!
                //输入新的姓名, 新的性别, 新的年龄
                System.out.println("请输入新的姓名,如果姓名不变请输入0");
                String newName = sc.next();
                if(!"0".equals(newName)){
                    student.setName(newName);
                }
                System.out.println("请输入新的年龄,如果年龄不变请输入0");
                String newAge = sc.next();
                if (!"0".equals(newAge)){
                   student.setAge( Integer.parseInt(newAge));
                }
                System.out.println("请输入新的性别,如果性别不变请输入0");
                String newGender = sc.next();
                if (!"0".equals(newGender)){
                    student.setGender( newGender);
                }
                //用不用将修改后的学员在设置回去!!!不用设置回去就能够生效, 原因我们并没有创建新的学生
                //修改的就是集合中的学生!!!!
                Utils.store2File(stuList, "day02/stu.txt");
                System.out.println("【修改成功!!!!】");
            }
        }

    }

    private static void deleteStudent(Scanner sc,ArrayList<Student> stuList) throws IOException {
        //如果集合中没有数据, 则证明没有学员, 这个删除功能没有意义
        if(stuList.size() == 0){//证明没有学员
            System.out.println("【没有学员给你删,别瞎玩!!!】");
        }else{
            //1.删除功能一旦执行, 首先应该展示一下所有学员的信息
            selectStudent(stuList);
            System.out.println("---------------------------------------");
            System.out.println("请输入你要删除的学号");
            int id = Integer.parseInt(sc.next()) ;
            //找集合中是否有id对应的学生存在!!!!
            int index = selectIndexFromArrayList(stuList, id);
            //判断index是否为-1;
            if(index == -1){//证明不存在
                System.out.println("【你要删除的学号对应的学生不存在!!!】");
            }else{//证明存在
                //将这个id对应的学生从集合中删除
                //将查到的删除的学员打印一下, 再次提醒用户是否真的删除
                System.out.println("【你要删除信息如下,您确定要删除吗? y/n】");
                System.out.println("***********************");
                System.out.println(stuList.get(index).show());
                System.out.println("***********************");
                String value = sc.next();
                if("y".equalsIgnoreCase(value)){//Y,y
                    stuList.remove(index);
                    //将集合数据同步到文件中
                    Utils.store2File(stuList, "day02/stu.txt");
                    System.out.println("【删除成功】");
                }else{
                    System.out.println("【删除取消】");
                }

            }

        }

    }
    /*
        注意: 学号的问题, 学号准备自动生成!!!!, 但是需要一个变量来去记录这样值
     */
    private static void addStudent(Scanner sc,ArrayList<Student> stuList) throws IOException {
        //输入 姓名, 年龄 ,性别
        System.out.println("请输入姓名");
        String name = sc.next();
        System.out.println("请输入年龄");
        int age = Integer.parseInt(sc.next());
        System.out.println("请输入性别");
        String gender = sc.next();
        //将多个数据封装成学生对象放入集合中
        Student student = new Student(++Utils.stuId,name,age,gender);

        //将学生添加到集合中
        stuList.add(student);
        //需要将集合中数据保存到文件中!!!
        Utils.store2File(stuList, "day02/stu.txt");
        //将新的id再次存回去
        Utils.storeId2File("day02/ids.txt");
        System.out.println("【添加学生成功!!!】");


    }


    public  static  int selectIndexFromArrayList(ArrayList<Student> list,int id){
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId() == id){
                index  = i;
                break;
            }
        }
        return index;

    }

}
