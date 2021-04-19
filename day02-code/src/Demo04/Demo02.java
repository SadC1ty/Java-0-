package Demo04;
/*
    基本类型与字符串之间的相互转换;
    基本类型 -> 字符串(String)
        1.基本类型的数据值+""最简单的方法;
        2.包装类的静态方法toString(),不是Object类中的toString()重载
        3.String类的静态方法valueOf(参数),返回int参数的字符串表示形式
    字符串(String) -> 基本类型
        使用包装类的静态方法parseXXX("数值类型的字符串");
            Integer类: static int parseInt(String s);
            Double类: static double parseDouble(String s);
 */
public class Demo02 {
    public static void main(String[] args) {
        //基本类型 -> 字符串(String)
        int in = 100;
        String str1 = in+"";
        System.out.println(str1);//100

        String str2 = Integer.toString(in);
        System.out.println(str2+"200");//100200

        String str3 = String.valueOf(100);
        System.out.println(str3+200);   //100200

        //字符串(String) -> 基本类型
        int i = Integer.parseInt(str1);
        System.out.println(i-10);//90

    }
}
