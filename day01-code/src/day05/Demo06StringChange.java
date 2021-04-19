package day05;
/*
String当中与转换相关的常用方法

public char[] toCharArray():将当前字符串拆分成为字符数组作为返回值;
public byte[] getBytes():获得当前字符串底层的字节数组;
public String replace(CharSequence oldString,CharSequence newString):将所有出现的老字符串转换为新字符串,返回结果替换之后的新字符串;
备注:CharSequence可以接收字符串类型
 */
public class Demo06StringChange {
    public static void main(String[] args) {
        //转换为字符数组;
        char[] charArray = "hello".toCharArray();
        System.out.println(charArray[0]);   //h
        System.out.println(charArray.length);   //5

        //转换为字节数组
        byte[] byteArray="Hello".getBytes();
        for(int i=0;i<byteArray.length;i++){
            System.out.println(byteArray[i]);
        }
        System.out.println("=====");

        //replace
        String str1 ="How do you do";
        String str2=str1.replace("o","*");
        System.out.println(str1);   //How do you do
        System.out.println(str2);   //H*w d* y*u d*



    }
}
