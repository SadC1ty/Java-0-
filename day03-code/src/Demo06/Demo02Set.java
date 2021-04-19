package Demo06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
    Map集合遍历的第一种方式: 通过键找值的方式
    Map集合方法:
        Set<K> keySet() 返回此映射中包含的键的Set视图
    实现步骤:
        1.使用Map集合中的方法keySet(),把Map集合所有的key取出来,存储到一个Set集合中
        2.遍历Set集合,获取Map集合中的每一个key
        3.通过Map集合中的方法get(key),通过key找到value
 */
public class Demo02Set {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("a",18);
        map.put("b",19);
        map.put("c",20);

        //1.使用Map集合中的方法keySet(),把Map集合所有的key取出来,存储到一个Set集合中
        Set<String> set = map.keySet();

        //2.遍历Set集合,获取Map集合中的每一个key
        //迭代器遍历
        Iterator<String> it = set.iterator();
        while(it.hasNext()){
            String key = it.next();
            //3.通过Map集合中的方法get(key),通过key找到value
            Integer value = map.get(key);
            System.out.println(key + value);
        }

        System.out.println("=========");
        //增强for遍历
        for(String key : set){
            Integer value = map.get(key);
            System.out.println(key + value);
        }

    }
}
