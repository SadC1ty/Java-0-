package Demo05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
    java.util.Collections是集合工具类，用来对集合进行操作。部分方法如下:
        - public static <T> void sort(List<T> list,Comparator<? super T>):将集合中元素按照默认规则排序

    Comparator和Comparable的区别
        Comparable: 自己(this)和别人(参数)比较，自己需要实现Comparable接口,重写比较的规则compareTo方法
        Comparator: 相当于找一个第三方,进行比较
 */
public class Demo03Collections {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,3,2,4);
        System.out.println(list);//[1, 3, 2, 4]

        Collections.sort(list, new Comparator<Integer>() {
            //重写比较的规则
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;//升序排序
                //return o2-o1;//降序排序
            }
        });
        System.out.println(list);//[1, 2, 3, 4]

        ArrayList<Student> list1 = new ArrayList<>();
        list1.add(new Student("a",18));
        list1.add(new Student("b",25));
        list1.add(new Student("c",17));
        System.out.println(list1);//[Student{name='a', age=18}, Student{name='b', age=25}, Student{name='c', age=17}]
//        Collections.sort(list1, new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                //年龄的升序排列
//                return o1.getAge()-o2.getAge();
//            }
//        });
//        System.out.println(list1);
        Collections.sort(list1, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //按照年龄升序排列
                int result = o1.getAge()-o2.getAge();
                //如果两个人年龄相同,再使用姓名的第一个字比较
                if(result == 0){
                    result = o1.getName().charAt(0) - o2.getName().charAt(0);
                }
                return result;
            }
        });
        System.out.println(list1);//[Student{name='c', age=17}, Student{name='a', age=18}, Student{name='b', age=25}]
    }
}
