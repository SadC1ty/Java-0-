package Demo02;
import java.util.Date;
public class Demo02Date {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
    }
    /*
        调用Long getTime():把日期转换为毫秒值
        相当于System.currentTimeMillis()方法
     */
    private static void demo03() {
        Date date = new Date();
        long time = date.getTime();
        System.out.println(time);
    }
    /*
        Date类的带参数构造方法
        Date(long date):传递毫秒值,把毫秒值转换为Date日期
     */
    private static void demo02() {
        Date date = new Date(0L);
        System.out.println(date);

        Date date1 = new Date(3742767510068L);
        System.out.println(date1);

    }

    /*
        Date类的空参数构造方法
        Date()获取当前系统时间的日期;
     */
    private static void demo01() {
        Date date = new Date();
        System.out.println(date);
    }
}
