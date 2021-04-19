package Demo06;

import java.util.HashMap;
import java.util.Hashtable;

/*
    java.util.Hashtable<K,V>集合 implements Map<K,V>接口

    Hashtable: 底层也是一个哈希表,是一个线程安全的集合,单线程集合,速度慢
    HashMap: 底层是一个哈希表,是一个线程不安全的集合,是多线程的集合,速度快

    HashMap集合: 可以存储空值空键(包括之前提到的所有集合)
    Hashtable集合: 不能存储null值, null键

    Hashtable和vector集合一样,在jdk1.2版本之后被更先进的集合所取代
    注意: Hashtable的子类Properties依然活跃在历史的舞台
 */
public class Demo06Hashtable {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put(null,"a");
        map.put("b",null);
        System.out.println(map);

        Hashtable<String,String> hashtable = new Hashtable<>();
        //hashtable.put(null,"a");//NullPointerException
        hashtable.put("a","a");
        System.out.println(hashtable);
    }
}
