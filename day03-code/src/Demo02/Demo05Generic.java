package Demo02;

import java.util.ArrayList;
import java.util.Iterator;

/*
    泛型的通配符：
        ?：代表任意的数据类型
    使用方式:
        不能创建对象使用
        只能作为方法的参数使用
 */
public class Demo05Generic {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(2);

        ArrayList<String> list02 = new ArrayList<>();
        list02.add("a");
        list02.add("b");


    }
    /*
        定义一个方法，能遍历所有的ArrayList集合
        这时候不确定ArrayList集合中存储的是什么数据类型，可以使用泛型的通配符?来接受数据类型
        注意：
            泛型没有继承概念;
     */
    public static void printArray(ArrayList<?> list){
        //使用迭代器遍历集合
        Iterator it = list.iterator();
        while(it.hasNext()){
            //it.next()方法默认Object类型
            Object s = it.next();
            System.out.println(s);
        }
    }
}
