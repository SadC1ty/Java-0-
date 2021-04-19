package day04;

import java.util.Random;    //导包
/*
Random类:用来生成随机数字

1.导包
2.创建
3.使用
 */
public class Demo04Random {
    public static void main(String[] args) {
        //创建
        Random one=new Random();
        //获取一个随机int型数字
        int num = one.nextInt();
        System.out.println("随机输出的数字是："+ num);
        System.out.println("=============");
        //获取一个随机int型数字(参数代表了范围)
        int num1 = one.nextInt(3);//实际上代表的含义是[0,3);
        System.out.println("随机输出的数字是："+num1);
    }
}
