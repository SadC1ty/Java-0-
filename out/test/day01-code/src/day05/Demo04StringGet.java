package day05;
/*
String当中与获取元素相关方法:

1.public int length():获取字符串长度;
2.public String concat(String str):拼接字符串;
3.public char charAt(int index):获取指定索引位置的单个字符(从0开始);
4.public int indexOf(String str): 查找参数字符串在本字符串中当中首次出现的索引位置,如果没有则返回-1值;
 */
public class Demo04StringGet {
    public static void main(String[] args) {
        //获取字符串长度
        int length="abcdsdsadasdasd".length();
        System.out.println("字符串长度为:"+length);   //15

        //拼接字符串
        String str1="Hello";
        String str2="World";
        String str3=str1.concat(str2);
        System.out.println("拼接后的字符串:"+str3); //创建新的字符串,原字符串不会改变;

        //获取指定索引位置的单个字符
        System.out.println("在1号位置的元素是:"+str1.charAt(1)); //e

        //查找参数字符串在原字符串的第一次字符串
        int num=str3.indexOf(str1); //0
        System.out.println("第一次出现的索引值是:"+num);
    }

}
