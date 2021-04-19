package Demo01;

import java.util.ArrayList;
import java.util.Collection;

/*
    Collection类中的常用方法调用
    1.public boolean add(E e):把给定对象添加到集合当中
    2.public void clear():清空当前的集合
    3.public boolean remove(E e):把给定的对象在当前集合中删除
    4.public boolean contains(E e):判断当前集合中是否包含给定的对象
    5.public boolean isEmpty():判断当前集合是否为空
    6.public int size():返回集合中元素的个数
    7.public Object[] toArray():集合当中元素,存储到数组当中
*/
public class Demo01Collection {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
        demo04();
        demo05();
    }
    //public boolean add(E e):把给定对象添加到集合当中
    private static void demo01(){
        Collection<String> col1 = new ArrayList<>();
        System.out.println(col1);   //重写了toString方法 []

        boolean b1 = col1.add("张三");
        System.out.println("b1:"+b1);   //true
        System.out.println(col1);//[张三]

        col1.add("李四");
        col1.add("王五");
        System.out.println(col1);//[张三, 李四, 王五]
    }
    /*
        public boolean remove(E e):把给定的对象在当前集合中删除
        集合中存在元素,删除元素,返回true;集合中不存在元素,删除失败,返回false
     */
    private static void demo02(){
        Collection<String> col1 = new ArrayList<>();
        col1.add("张三");
        col1.add("李四");
        col1.add("王五");
        col1.remove("张三");
        System.out.println(col1);//[李四, 王五]
        boolean b = col1.remove("天气");
        System.out.println(b);//false
        System.out.println(col1);//[李四, 王五]
    }
    //public boolean contains(E e):判断当前集合中是否包含给定的对象
    private static void demo03(){
        Collection<String> col1 = new ArrayList<>();
        col1.add("张三");
        col1.add("李四");
        col1.add("王五");
        boolean b = col1.contains("张三");
        System.out.println(b);//true
    }
    //public boolean isEmpty():判断当前集合是否为空
    private static void demo04(){
        Collection<String> col1 = new ArrayList<>();
        boolean b = col1.isEmpty();
        System.out.println(b);//true
        col1.add("张三");
        col1.add("李四");
        col1.add("王五");
        b = col1.isEmpty();
        System.out.println(b);//false
    }
    //public int size():返回集合中元素的个数
    //public Object[] toArray():集合当中元素,存储到数组当中
    //public void clear():清空当前的集合
    private static void demo05() {
        Collection<String> col1 = new ArrayList<>();
        col1.add("张三");
        col1.add("李四");
        col1.add("王五");
        System.out.println(col1);//[张三, 李四, 王五]
        int size = col1.size();
        System.out.println("size:"+size);//size: 3
        Object[] arr= col1.toArray();
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);//张三 李四 王五
        }
        col1.clear();
        System.out.println(col1);//[]
    }
}
