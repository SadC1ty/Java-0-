package day04;
import java.util.ArrayList;
/*
数组的长度不可以改变;
ArrayList集合长度可以随意变化;
1.导包
2.创建
3.使用
 */
public class Demo08ArrayList {
    public static void main(String[] args) {
        //尖括号内部的String代表泛型,里面所有的数据都是String类型;
        ArrayList<String> lists = new ArrayList<String>();

        //对于集合ArrayList来说,直接打印ArrayList出来的不是地址值,是内容;
        System.out.println(lists);

        //向集合添加数据
        lists.add("SadC1ty");
        System.out.println(lists);
        System.out.println("======");
    }
}
