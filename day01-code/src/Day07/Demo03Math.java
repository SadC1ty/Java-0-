package Day07;
/*
public static double abs(double num):取绝对值
public static double ceil(double num):向下取整
public static double floor(double num):向上取整
public static long round(double num):四舍五入
 */
public class Demo03Math {
    public static void main(String[] args) {
        //取绝对值
        System.out.println(Math.abs(-5));//5

        //向上取整
        System.out.println(Math.ceil(5.8));//6.0

        //向下取整
        System.out.println(Math.floor(4.3));//4.0

        //四舍五入
        System.out.println(Math.round(5.6));//6
        System.out.println(Math.round(4.3));//4
    }
}
