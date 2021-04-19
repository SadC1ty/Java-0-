package Demo02;
import java.util.Date;
/*
    Date类是表示日期和时间的类;
    类Date表示特定的瞬间,精确到毫秒;
    明确毫秒值,千分之一秒;
    毫秒值的作用,可以对日期和时间进行计算;
    例如:可以把日期转换成毫秒进行计算,计算完成后再转换为日期;

    把时间转换为毫秒:
        当前日期:2077-01-01
        时间原点(0毫秒):1970-01-01 00:00:00(英国格林尼治时间)
    注意:
        中国属于东八区，会把时间增加8个小时;

    把毫秒转换成日期:
        1天 = 24*60*60=86400秒=86400*1000=86400000毫秒
 */
public class Demo01Date {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());//获取当前系统时间到时间原点经历了多少毫秒
    }
}
