package Demo05;

import java.util.ArrayList;
import java.util.Collections;

/*
    java.util.Collections是集合工具类，用来对集合进行操作。部分方法如下:
        - public static <T> void sort(List<T> list):将集合中元素按照默认规则排序
    重写排序的规则:this-参数升序排列，参数-this就是降序排列
 */
public class Demo02Collections {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,3,2,4);
        System.out.println(list);//[1, 3, 2, 4]


        Collections.sort(list);
        System.out.println(list);//[1, 2, 3, 4]

        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1,"a","c","b");
        System.out.println(list1);//[a, c, b]

        Collections.sort(list1);
        System.out.println(list1);//[a, b, c]

        //对自定义的数据形式排序
        ArrayList<Person> list2 = new ArrayList<>();
        list2.add(new Person("a",18));
        list2.add(new Person("b",23));
        list2.add(new Person("c",21));

        System.out.println(list2);//[Person{name='a', age=18}, Person{name='b', age=23}, Person{name='c', age=21}]

        Collections.sort(list2);
        System.out.println(list2);//[Person{name='a', age=18}, Person{name='c', age=21}, Person{name='b', age=23}]

    }
}
