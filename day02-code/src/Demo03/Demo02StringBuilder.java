package Demo03;
/*
    StringBuilder类
        字符串缓冲区,可以提高字符串的操作效率(可以看作是一个字符串)
        底层是一个数组,但是没有被final修饰,可以改变长度
        byte[] value = new byte[16];

        eg:“a”+"b"+"c"="abc"
        StringBuilder在内存中始终是一个数组,占用空间少,效率高,当容量不足,会自动扩容;

    java.lang.StringBuilder类:
        StringBuilder()构造一个不带任何字符的字符串生成器,其初始容量为16个字符;
        StringBuilder(String str)构造一个字符串生成器,并初始化为指定的字符串内容;
*/
public class Demo02StringBuilder {
    public static void main(String[] args) {
        //空参数构造方法
        StringBuilder bu1 = new StringBuilder();
        System.out.println(bu1);    //默认为空字符串
        //带字符串的构造方法
        StringBuilder bu2 = new StringBuilder("abc");
        System.out.println(bu2);    //abc
    }
}
