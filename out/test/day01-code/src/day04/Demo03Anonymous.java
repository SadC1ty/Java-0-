package day04;
import java.util.Scanner;
/*
创建对象：
    类名称 对象名= new 类名称()
匿名对象创建：
    new 类名称()
 */
public class Demo03Anonymous {
    public static void main(String[] args) {
        //普通使用
        //Scanner sc = new Scanner(System.in);
        //int num1 = sc.nextInt();
        //System.out.println("输入："+num1);

        //匿名对象使用
        //int num2 = new Scanner(System.in).nextInt();
        //System.out.println("输入："+num2);

        //使用一般写法传入参数
        //Scanner sc1 = new Scanner(System.in);
        //methodParam(sc1);

        //使用匿名对象传参
        //methodParam(new Scanner(System.in));

        //使用匿名对象作为返回值
        Scanner sc = methodReturn();
        int num = sc.nextInt();
        System.out.println("输入：" +num);
    }

    public static void methodParam(Scanner sc){
        int num = sc.nextInt();
        System.out.println("输入："+num);
    }

    public static Scanner methodReturn(){
        return new Scanner(System.in);
    }
}
