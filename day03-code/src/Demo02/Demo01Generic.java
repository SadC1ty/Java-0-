package Demo02;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo01Generic {
    public static void main(String[] args) {
        show01();
        show02();
    }
    /*
        创建集合对象，不使用泛型
        好处：
            集合不适用泛型，默认的类型就是Object类型，可以存储类型的数据
        弊端：
            不安全，会引发异常
     */
    private static void show01(){
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add(1);

        //使用迭代器遍历list集合
        //获取迭代器
        Iterator it = list.iterator();
        //使用迭代器中的方法hasNext和next遍历集合
        while(it.hasNext()){
            //取出元素也是object类型
            Object obj = it.next();
            System.out.println(obj);

            //想要使用String特有的方法，获取字符串的长度(不能使用，多态不能使用子类的方法)
            //向下转型
            //会抛出ClassCastException类型转换异常，不能Integer类型转换为String类型(元素 1)
            String s = (String) obj;
            System.out.println(s.length());

        }
    }
    /*
        创建集合对象，使用泛型
        好处：
            1.避免了类型转换，存储的是什么类型，取出的就是什么类型
            2.把运行异常(代码运行之后抛出的异常)，提升到了编译期异常
        弊端：
            泛型是什么类型，就只能存储什么类型的数据
     */

    private static void show02(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("abc");
        //list.add(1);会报错

        //使用迭代器遍历list集合
        //获取迭代器
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            System.out.println(s.length());
        }
    }
}
