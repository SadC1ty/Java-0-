package day05;
/*
String类型的分割方法:
public String[] split(String regex):按照参数的规则,将字符串切分成若干个部分;
注意事项:
split方法的参数是正则表达式;
如果按照英文句点进行切分,需要按照"\\."方式切割;
 */
public class Demo07StringSplit {
    public static void main(String[] args) {
        String str1 = "H,e,l,l,o,World";
        String[] strings=str1.split(",");
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
    }
}
