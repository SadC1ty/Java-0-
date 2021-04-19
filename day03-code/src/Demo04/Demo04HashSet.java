package Demo04;

import java.util.HashSet;

/*
    HashSet存储自定义类型元素

    Set集合报错元素唯一：
        存储的元素(String Integer ...),必须重写hashCode()方法和equals方法
    要求：
        同名同年龄的人,视为一个人,只能存储一次
 */
public class Demo04HashSet {
    public static void main(String[] args) {
        //创建HashSet集合存储Person
        HashSet<Person> hashSet = new HashSet<>();
        Person p1 = new Person("a",15);
        Person p2 = new Person("a", 15);
        Person p3 = new Person("a",17);

        hashSet.add(p1);
        hashSet.add(p2);
        hashSet.add(p3);
        System.out.println(hashSet);
        //[姓名：a年龄：15, 姓名：a年龄：15, 姓名：a年龄：17](未重写前)
        //[姓名：a年龄：17, 姓名：a年龄：15](重写后)
    }
}
