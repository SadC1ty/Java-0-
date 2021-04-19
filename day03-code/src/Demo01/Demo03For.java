package Demo01;

import java.util.ArrayList;

/*
    增强for循环:底层依然使用迭代器,用for循环的格式,简化了迭代器的使用
    JDK1.5之后
 */
public class Demo03For {
    public static void main(String[] args) {
        demo01();
    }
    private static void demo01(){
        ArrayList<String> list = new ArrayList<>();

        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        for(String s:list){
            System.out.println(s);  //aaa bbb ccc
        }
    }
}
