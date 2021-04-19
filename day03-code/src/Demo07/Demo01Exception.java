package Demo07;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    java.lang.Throwable: 类是Java语言中所有错误和异常的超类
        Exception: 编译期异常,进行编译(写代码)java程序出现的问题
            RuntimeException: 运行期异常,java程序运行过程中出现的问题
        Error: 错误
            必须修改源代码,程序才能继续执行
 */
public class Demo01Exception {
    public static void main(String[] args) /* throws ParseException */ {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Date date = null;
        try {
            date = simpleDateFormat.parse("1999-02-09");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date);
        //交给虚拟机处理，会中断程序
        //Date date1 = simpleDateFormat.parse("1999-9999");
        //System.out.println(date1);//报错
        //通过try/catch，程序会继续进行
        Date date1 = null;
        try {
            date1 = simpleDateFormat.parse("1999-9999");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(date1);//ParseException
        System.out.println("正常进行");//正常进行,照常打印出

        //RuntimeException
        int[] arr = {1,2,3};
        //System.out.println(arr[0]);
        try{
            //可能会出现异常的代码
            System.out.println(arr[3]);
        }catch (Exception e){
            System.out.println(e);//java.lang.ArrayIndexOutOfBoundsException: 3
        }
        System.out.println("正常进行");
        //Error错误
        int[] arr1  = new int[1024*1024*1024];//OutOfMemoryError,超出了分给JVM的内存,必须修改代码
        System.out.println("正常进行");

    }
}
