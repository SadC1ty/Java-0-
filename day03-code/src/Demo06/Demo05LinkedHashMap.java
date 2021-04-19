package Demo06;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*
    java.util.LinkedHashMap<K,V> extends HashMap<K,V>
    Map接口的哈希表和链表实现,具有可预知的迭代顺序
    底层原理:
        哈希表+链表(记录元素的顺序)
 */
public class Demo05LinkedHashMap {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("a","A");
        map.put("c","B");
        map.put("b","C");
        map.put("a","D");
        System.out.println(map);//{a=D, b=C, c=B}

        LinkedHashMap<String,String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("a","A");
        linkedHashMap.put("b","B");
        linkedHashMap.put("c","C");
        linkedHashMap.put("d","D");
        System.out.println(linkedHashMap);//{a=A, b=B, c=C, d=D}
    }
}
