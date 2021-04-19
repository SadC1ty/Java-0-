package Demo02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DemoDateTest {
    public static void main(String[] args) throws ParseException {
        //键入出生日期
        Scanner sc= new Scanner(System.in);
        System.out.println("键入出生日期: (例如yyyy-MM-dd)");
        String birth = sc.next();
        //使用DateFormat类中的方法parse,把字符串的出生日期转换为Date格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthDay = sdf.parse(birth);
        //转换成毫秒值
        long birthDayTime = birthDay.getTime();
        long todayTime = new Date().getTime();
        long time = birthDayTime - todayTime;
        System.out.println(time/1000/60/20/24+"天");
    }
}
