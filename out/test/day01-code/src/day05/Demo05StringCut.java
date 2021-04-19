package day05;
/*
字符串的截取方法,两种重载形式;

public String substring(int index):从参数位置,一直截取到字符串末尾，返回字符串;
public String substring(int begin,int end):截取从begin开始,一直到end结束,中间的字符串
备注:[begin.end)能取到begin,取不到end;
 */
public class Demo05StringCut {
    public static void main(String[] args) {
        String str1= "HelloWorld";
        String str2=str1.substring(5);
        System.out.println(str2);//World

        String str3 = str1.substring(0,5);
        System.out.println(str3);//Hello 能取到左边,取不到右边;
    }
}
