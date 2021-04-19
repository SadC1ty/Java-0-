package Demo03;
/*
    StringBuilder的常用方法
        1.public StringBuilder append(....);添加任意类型字符串形式,并返回当前对象自身;
        2.public String toString(...);将StringBuilder和String之间相互转换;
 */
public class Demo03StringBuilder {
    public static void main(String[] args) {
        //demo01();
        demo02();
    }
    private static void demo01(){
        StringBuilder bu1 = new StringBuilder();
        StringBuilder bu2 = bu1.append("abc");//abc,把bu的地址赋值给了bu2
        System.out.println(bu1==bu2);   //比较的是地址,返回true

        //使用append方法无需接受返回值
        bu1.append(1);
        bu1.append(9.9);
        bu1.append('中');
        bu1.append(true);

        System.out.println(bu1);//abc19.9中true

        /*
            链式编程:方法返回值是一个对象,可以继续调用方法
         */
        System.out.println("abc".toUpperCase().toLowerCase().toUpperCase().toLowerCase());
        bu1.append("abc").append("abc").append(12).append(34);
        System.out.println(bu1);//abc19.9中trueabcabc1234
    }
    private static void demo02(){
        String str = "hello";
        System.out.println("str:"+str);//hello
        StringBuilder bu = new StringBuilder(str);
        bu.append(" Java");
        System.out.println("bu:"+ bu);//hello Java

        String ans = bu.toString();
        System.out.println("ans:" + ans);   //hello Java
    }
}
