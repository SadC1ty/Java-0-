package day05;

import java.lang.reflect.Array;

/*
java.lang.String代表字符串;
API当中:Java程序中,所有字符串字面值都作为此类的实例实现;

字符串的特点
1.字符串是常量[重点];
2.字符串可以共享使用;
3.字符串效果上相当于char[]的字符数组;
4.字符串底层原理是byte[]字节数组;

备注:直接写上双引号,就是字符串对象;
 */
public class Demo01String {
    public static void main(String[] args) {
        //字符串的创建方式
        //1.构造方法,创建一个空白字符串，不留任何内容
        String str1=new String();
        System.out.println("第一个字符串:"+str1);
        System.out.println("==========");
        //2.构造方法,根据字符数组的内容,创建对应的字符串
        char[] charArray={'A','B','C'};
        String str2=new String(charArray);
        System.out.println("第二个字符串:"+str2);
        System.out.println("==========");
        //3.构造方法,根据字节数组的内容,创建对应的字符串
        byte[] byteArray={97,98,99};
        String str3 = new String(byteArray);
        System.out.println("第三个字符串:"+str3);
        System.out.println("==========");
        //4.直接创建
        String str4 = "Hello,World";
        System.out.println("第四个字符串:"+str4);
    }
}
