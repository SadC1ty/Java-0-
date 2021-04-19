package day05;
/*
内容比较方法:
1.public boolean equals(Object obj);  参数可以是任何对象,只有参数是一个字符串并且内容相同返回true;
任何对象都能用Object进行接收;
equals方法具有对称性;
如果比较双方一个常量一个变量,推荐把常量字符串写在前;
2.public boolean equalsIgnoreCase(String str):忽略大小写,进行大小写比较;
 */
public class Demo03StringCompare {
    public static void main(String[] args) {
        //equals方法;
        String str1="Hello";
        String str2="Hello";
        char[] charArray={'H','e','l','l','o'};
        String str3=new String(charArray);

        System.out.println(str1.equals(str2));      //true
        System.out.println(str1.equals(str3));      //true
        System.out.println(str1.equals("Hello"));   //true,不推荐,避免空指针异常
        System.out.println("Hello".equals(str1));   //true,推荐写法

        String str4 = "hello";
        System.out.println(str1.equalsIgnoreCase(str4));    //true 忽略大小写

    }
}
