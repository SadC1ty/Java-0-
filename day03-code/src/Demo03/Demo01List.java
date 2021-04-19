package Demo03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    java.util.list接口 extends Collection接口
    List接口的特点:
        1.有序的集合，存储元素和取出元素的顺序是一致的
        2.有索引，包含了一些带索引的方法
        3.允许存储重复的元素
    List接口中带索引的方法
        - public void add(int index,E element):将指定的元素，添加到该集合中的指定位置
        - public E get(int index):返回集合中指定位置的元素
        - public E remove(int index):移除列表中指定位置的元素,返回的是被移除元素
        - public E set(int index, E element):用指定元素替换集合中指定位置的元素，返回值是更新前的元素
    注意:
        操作索引的时候,一定要防止索引越界异常
 */
public class Demo01List {
    public static void main(String[] args) {
        //创建一个List集合对象，可以使用多态
        List<String> list = new ArrayList<String>();
        //使用add方法
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        //打印集合
        System.out.println(list);//[a, b, c, d, a],重写了toString方法

        //public void add(int index,E element):将指定的元素，添加到该集合中的指定位置
        //在c,d直接添加元素
        list.add(3,"SadC1ty");
        System.out.println(list);//[a, b, c, SadC1ty, d, a]

        //public E remove(int index):移除列表中指定位置的元素,返回的是被移除元素
        String removeE = list.remove(3);
        System.out.println("被移除的元素:"+removeE);//SadC1ty
        System.out.println(list);//[a, b, c, d, a]

        //public E set(int index, E element):用指定元素替换集合中指定位置的元素，返回值是更新前的元素
        //替换最后一个a为e
        String setE = list.set(4,"e");
        System.out.println("被替换的元素："+setE);
        System.out.println(list);

        //public E get(int index):返回集合中指定位置的元素
        //可以使用普通for循环来遍历list
        for (int i = 0; i < list.size(); i++) {
            System.out.println("第"+i+"处的元素是："+list.get(i));
        }
        //可以使用迭代器循环
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s =it.next();
            System.out.println(s);
        }
        //使用增强for
        for(String s:list){
            System.out.println(s);
        }

        //String errorE = list.get(5); //索引越界异常
        //System.out.println(errorE);
    }
}
