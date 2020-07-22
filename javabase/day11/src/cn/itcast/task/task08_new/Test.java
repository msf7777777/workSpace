package cn.itcast.task.task08_new;

/*
题目八
	请在横线处补充代码,使得编码编译正确,运行代码可以在控制台上打印"helloworld"
	public interface A{
		void method();
	}
	public class Test{
		public static void main(String[] args){
				fun().method();

		}
		public static _____ fun(){
			______
		}
	}
 */
public class Test {
    public static void main(String[] args){
        fun().method();
    }
    public static A fun(){
        return new A(){
            @Override
            public void method() {
                System.out.println("helloworld");
            }
        };
    }
}
