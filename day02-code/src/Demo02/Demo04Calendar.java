package Demo02;

import java.util.Calendar;
import java.util.Date;

/*
    Calendar是一个抽象类
    java.util.Calendar:日历类,是一个抽象类,里边提供了操作日历的方法
    Calendar无法直接创建对象使用,使用静态方法getInstance(),该方法返回了Calendar类的子类对象
    static Calendar getInstance() 使用默认时区和语言环境获得一个日历
    Calendar的常用方法
    1.get方法:public int get(int field),返回给定日历字段的值
    2.set方法:public void set(int field,int value),将给定的日历字段设置为定值
    3.add方法:public abstract void add(int field,int amount),根据日历的规则,为给定的日历字段添加或减去指定的时间问题
    4.getTime方法:public getTime(),返回一个表示此Calendar时间值(从历元到现在的毫秒偏移量)的Date对象
    成员方法的参数:
        int field: 日历类的字段,可以使用Calendar类的静态成员变量获取;
 */
public class Demo04Calendar {
    public static void main(String[] args) {
        Calendar a = Calendar.getInstance();    //多态
        System.out.println(a);
        demo01();
    }
    /*
        public int get(int field),返回给定日历字段的值
     */
    private static void demo01(){
        //
        Calendar a = Calendar.getInstance();
        int year = a.get(Calendar.YEAR);
        System.out.println(year);

        int month = a.get(Calendar.MONTH);
        System.out.println(month);  //西方的月份0-11,东方的月份1-12

        int day = a.get(Calendar.DATE);
        System.out.println(day);
    }
    /*
        public void set(int field,int value),将给定的日历字段设置为定值
     */
    private static void demo02(){
        Calendar a = Calendar.getInstance();
        a.set(Calendar.MONTH,5);
        a.set(Calendar.YEAR,666);
        demo01();
        //同时设置年月日
        a.set(666,5,4);
        demo01();
    }
    /*
        public abstract void add(int field,int amount),根据日历的规则,为给定的日历字段添加或减去指定的时间问题
     */
    private static void demo03(){
        Calendar a= Calendar.getInstance();
        a.add(Calendar.YEAR,1);
        a.add(Calendar.MONTH,-1);
        a.add(Calendar.DATE,6);
        demo01();
    }
    /*
        public getTime(),返回一个表示此Calendar时间值(从历元到现在的毫秒偏移量)的Date对象
     */
    private static void demo04(){
        Calendar a = Calendar.getInstance();

        Date ans = a.getTime();
        System.out.println(ans);
    }
}
