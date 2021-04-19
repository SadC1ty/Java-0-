package day04;
import java.util.Scanner;   //导包
/*
Scanner 类的作用：实现键盘输入数据，到程序当中

引用类型的一般使用步骤

1.导包
import 包路径，类名称
只有java.lang包下的内容不需要导包

2.创建
类名称 对象名 = new 类名称()

3.使用
对象名.成员方法名()

例：
获取键盘输入的一个数字(int型): int num = sc.nextInt()
获取键盘输入的一个字符串: String a = sc.next()
 */
public class Demo01 {
    public static void main(String[] args) {
        //创建
        Scanner sc=new Scanner(System.in);//System.in 代表从键盘进行输入

        //获取键盘输入的一个数字(int型)
        int num=sc.nextInt();
        System.out.println("输入的数字是："+num);
        System.out.println("===============");
        //获取键盘输入的一个字符串
        String a = sc.next();
        System.out.println("输入的字符串是："+a);
    }
}
