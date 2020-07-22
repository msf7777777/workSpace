package cn.itcast.practice.date;

import java.util.Date;

public class Test02 {
    public static void main(String[] args) {
        //想要1970年01月02日的8点
        Date date1970_01_02_08_00= new Date((long)1000 * 60 * 60 * 24);
        System.out.println(date1970_01_02_08_00);

        //想要1980年01月02日的8点
        Date date1980_01_01_08_00= new Date((long)1000 * 60 * 60 * 24 * 365 * 10 + (long)1000 * 60 * 60 * 24 * 2);
        System.out.println(date1980_01_01_08_00);
    }
}
