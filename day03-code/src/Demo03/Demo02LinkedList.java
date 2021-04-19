package Demo03;

import java.util.LinkedList;

/*
    java.util.LinkedList集合 implements List接口
    LinkedList集合的特点:
        1.底层是一个链表结构:查询慢，增删快
        2.里边包含了大量操作首尾元素的方法
        注意: 使用LinkedList集合特有的方法，不能使用多态
    常用方法
        - public void addFirst(E e):将指定元素插入此列表的开头
        - public void addLast(E e):将指定元素添加到此列表的结尾
        - public void push(E e):将元素推入此列表所表示的堆栈


        - public E getFirst():返回此列表的第一个元素
        - public E getLast():返回此列表的最后一个元素
        - public E removeFirst():移除并返回此列表的第一个元素
        - public E removeLast():移除并返回此列表的最后一个元素
        - public void pop():从此列表的堆栈中弹出一个元素
        - public boolean isEmpty():如果列表为空，返回true
 */
public class Demo02LinkedList {
    public static void main(String[] args) {
        show01();
        show02();
        show03();
    }
    /*
        - public void addFirst(E e):将指定元素插入此列表的开头
        - public void addLast(E e):将指定元素添加到此列表的结尾
        - public void push(E e):将元素推入此列表所表示的堆栈
     */
    private static void show01(){
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);//[a, b, c]
        //public void addFirst(E e):将指定元素插入此列表的开头
        linked.addFirst("aaa");
        System.out.println(linked);//[aaa, a, b, c]
        //public void push(E e):将元素推入此列表所表示的堆栈等效于addFirst
        linked.push("000");
        System.out.println(linked);//[000, aaa, a, b, c]
        //public void addLast(E e):将指定元素添加到此列表的结尾等效于add方法
        linked.addLast("ccc");
        System.out.println(linked);//[000, aaa, a, b, c, ccc]
    }
    /*
        - public E getFirst():返回此列表的第一个元素
        - public E getLast():返回此列表的最后一个元素
     */
    private static void show02(){
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);

        String firstE = linked.getFirst();
        System.out.println(firstE);//a

        String lastE =linked.getLast();
        System.out.println(lastE);//c

        //linked.clear();
        //firstE = linked.getFirst();//会报出NoSuchElementException
        //可以增加判断
        //if(!linked.isEmpty()){
        //
        //}
    }
    /*
        - public E removeFirst():移除并返回此列表的第一个元素
        - public E removeLast():移除并返回此列表的最后一个元素
        - public void pop():从此列表的堆栈中弹出一个元素
     */
    private static void show03(){
        LinkedList<String> linked =new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);

        String firstE = linked.removeFirst();
        String lastE = linked.removeLast();
        //public E removeFirst():移除并返回此列表的第一个元素
        System.out.println("移除的首元素:"+firstE);
        //public E removeLast():移除并返回此列表的最后一个元素
        System.out.println("移除的尾元素"+lastE);
        System.out.println(linked);
        //public void pop():从此列表的堆栈中弹出一个元素 等效于removeFirst();
    }
}
