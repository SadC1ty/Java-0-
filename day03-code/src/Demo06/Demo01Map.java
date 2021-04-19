package Demo06;

import java.util.HashMap;
import java.util.Map;

/*
    java.util.Map<k,v>集合
    Map集合的特点:
        1.Map集合是一个双列集合，一个元素包含两个值(一个key,一个Value);
        2.Map集合中的元素,key和value的数据类型可以相同,也可以不同;
        3.Map集合中的元素,key是不允许重复的,value是可以重复的;
        4.Map集合中的元素,key和value是一一对应的;
    java.util.HashMap<k,v>集合 implements Map<k,v>接口
    HashMap集合的特点:
        1.HashMap集合底层是哈希表:查询的速度特别的快
            JDK1.8之前:数组+单向链表
            JDK1.8之后:数组+单向链表/红黑树(提高查询速度)
        2.HashMap集合是一个无序集合,存储元素和取出元素的顺序有可能不一致
    java.util.LinkedHashMap<k,v>集合 extends HashMap<k,v>集合
    LinkedHashMap的特点:
        1.LinkedHashMap集合底层是一个哈希表+链表(保证迭代的顺序);
        2.LinkedHashMap集合是一个有序的集合,存储元素和取出元素的顺序是一致的
 */
public class Demo01Map {
    public static void main(String[] args) {
        //show01();
        //show02();
        //show03();
        show04();
    }
    /*
        public V put(K key,V value): 把指定的键与指定的值存入Map集合中
            返回值: v
                存储键值对象时,key不重复,返回值是null
                存储键值对象时,key重复,会使用新的value替换map中重复的value,返回被替换的value值
     */
    private static void show01(){
        //创建Map集合对象，多态
        Map<String,String> map = new HashMap<String,String>();

        String v1 = map.put("a","A");
        System.out.println("v2:"+v1);

        String v2 = map.put("b","B");
        System.out.println("v2:"+v2);

        System.out.println(map);//{a=A, b=B}
    }
    /*
        public V remove(Object key): 把指定的键所对应的键值对元素 在Map集合中删除,返回被删除的元素的值
            返回值: V
                key存在,v返回的值
                key不存在,v返回的null
     */
    private static void show02(){
        Map<String,Integer> map = new HashMap<>();
        map.put("a",18);
        map.put("b",19);
        map.put("c",20);
        System.out.println(map);//{a=18, b=19, c=20}

        Integer v1 = map.remove("c");
        System.out.println(map);//{a=18, b=19}

        Integer v2 = map.remove("d");
        System.out.println(v2);//null
        System.out.println(map);//{a=18, b=19}
    }
    /*
        public V get(Object key): key存在返回对应的value值,不存在返回null
     */
    private static void show03(){
        Map<String,Integer> map = new HashMap<>();
        map.put("a",18);
        map.put("b",19);
        map.put("c",20);

        Integer v1 = map.get("a");
        System.out.println("v1:"+v1);//v1:18
        Integer v2 = map.get("d");
        System.out.println("v2:"+v2);//v2:null
    }
    /*
        boolean containsKey(Object key): 判断集合中是否包含指定的键
        包含返回true,不包含返回false
     */
    private static void show04(){
        Map<String,Integer> map = new HashMap<>();
        map.put("a",18);
        map.put("b",19);
        map.put("c",20);

        boolean b1 = map.containsKey("a");
        System.out.println("b1:"+b1);//b1:true

        boolean b2 = map.containsKey("d");
        System.out.println("b2:"+b2);//b2:false
    }
}
