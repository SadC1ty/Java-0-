package Demo01;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /*
    直接打印对象的name，重写Object类的toString方法
     */
    @Override
    public String toString(){
        return this.name;
    }
    /*
    重写Object类中的equals方法，比较两个对象的属性
    问题：
        隐含着一个多态,弊端：无法使用子类特有的内容;
    解决:
        向下转型,把obj转换为Person类
     */
//    @Override
//    public boolean equals(Object obj){
//        //增加判断提高程序效率
//        if(obj == this) return true;
//        if(obj == null) return false;
//        //向下转型,判断防止类型转换异常
//        if(obj instanceof Person){
//            Person p = (Person)obj;
//            //比较两个对象的属性;
//            boolean ans = this.name.equals(p.name)&&this.age == p.age;
//            return ans;
//        }
//        //不是Person类
//        return false;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        //getClass() != o.getClass()使用反射技术,判断o是否是Person类型等效于obj instanceof Person
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
