package cn.itcast.task;
/*
3. 编程题【泛型】
	有以下类结构：
		人员类(Person)：
			|--学生类(Student)
				|--Java学生类(JavaStudent)
				|--UI学生类(UIStudent)
			|--教师类(Teacher)
				|--Java教师类(JavaTeacher)
				|--UI教师类(UITeacher)
	要求：
 	请按上述要求定义类，并实现继承关系即可(不需要定义类成员)
 	请按以下格式和要求定义测试类和方法：
	public class Test4_1{
		public static void main(String[] args){
			ArrayList<String> list1 = new ArrayList<>();
			ArrayList<Person> list2 = new ArrayList<>();
			ArrayList<Student> list3 = new ArrayList<>();
			ArrayList<JavaStudent> list4 = new ArrayList<>();
			ArrayList<UIStudent> list5 = new ArrayList<>();
			ArrayList<Teacher> list6 = new ArrayList<>();
			ArrayList<JavaTeacher> list7 = new ArrayList<>();
			ArrayList<UITeacher> list8 = new ArrayList<>();

			//请测试哪些集合可以调用print1()方法
			//请测试哪些集合可以调用print2()方法
			//请测试哪些集合可以调用print3()方法
			//请测试哪些集合可以调用print4()方法
		}
		public static void print1(ArrayList<?> list){

        }
        //要求：参数可以接收任何Person及其子类泛型的ArrayList参数
        public static void print2(ArrayList<? extends Person> list){
        }
        //要求：参数可以接收任何Student及其子类泛型的ArrayList参数
        public static void print3(ArrayList<? extends Student> list){
        }
        //要求：参数可以接收任何Java学员，及其父类泛型的ArrayList参数
        public static void print4(ArrayList<? super Java> list){
        }
	}
 */
public class Test03 {
}
