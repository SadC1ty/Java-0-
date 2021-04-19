package Demo06;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    HashMap存储自定义类型键值
    Map集合保证key时唯一的
        作为key的元素,必须重写hashCode和equals方法,以保证key唯一
 */
public class Demo04Map {
    public static void main(String[] args) {
        show01();
        show02();
    }
    /*
        HashMap存储自定义类型键值
        key:String类型
            String类型重写hashCode方法和equals方法,可以保证key唯一
        value:Person类型
            Value可以重复(同名同年龄的人视为同一个人)
     */
    private static void show01(){
        HashMap<String,Person> map = new HashMap<>();

        map.put("北京",new Person(18,"a"));
        map.put("上海",new Person(15,"b"));
        map.put("西安",new Person(20,"c"));
        map.put("东京",new Person(19,"d"));
        //增强for
        Set<String> set = map.keySet();
        for(String key :set){
            Person value = map.get(key);
            System.out.println(key+"->"+value);
        }
    }
    /*
        HashMap存储自定义类型键值
        key:Person类型
            Person类必须重写hashCode方法和equals方法,以保证key唯一
        value:String类型,可以重复
     */
    private static void show02(){
        HashMap<Person,String> map = new HashMap<>();
        map.put(new Person(18,"a"),"北京");
        map.put(new Person(19,"b"),"上海");
        map.put(new Person(20,"c"),"东京");
        map.put(new Person(18,"a"),"西安");

        //使用entrySet
        Set<Map.Entry<Person,String>> set = map.entrySet();
        for(Map.Entry<Person,String> entry:set){
            Person key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"->"+value);
        }
    }
}
