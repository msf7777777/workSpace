package cn.itcast.task.task01.QAndA_3_3;

public class Outside {
    private int a = 100;
    class Inside{
        private int a = 200;
        public void show(){
            int a = 300;
            System.out.println(Outside.this.a);//100
            System.out.println(Inside.this.a);//200
            System.out.println(a);//300
        }
        //内部构造函数
        public Inside() {
        }
        public Inside(int a) {
            this.a = a;
        }
        //内部Getter and Setter
        public int getA() {
            return a;
        }
        public void setA(int a) {
            this.a = a;
        }
    }

    //★★★★★★★主方法在这里★★★★★★★
    public static void main(String[] args) {
        Outside.Inside inside = new Outside().new Inside();
        inside.show();
    }
    //★★★★★★★主方法在这里★★★★★★★

    //外部构造函数
    public Outside() {
    }
    public Outside(int a) {
        this.a = a;
    }
    //外部Getter and Setter
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
}
