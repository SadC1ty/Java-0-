package demo02;
/*
构造方法是专门用来创建对象的方法，当我们通过关键字new来创建对象时，其实就是在调用构造方法；
格式：
    public 类名称(参数类型 参数名称)
        方法体

注意事项：
1.构造方法的名称必须和所在的类名称完全一样
2.构造方法不写返回值类型(包括void)
3.不能return一个返回值
4.没有编写构造方法，编译器会默认编写构造方法，方法体为空
5.一旦编写了至少一个构造方法，编译器将不会默认编写构造方法
6.构造方法也可以重载
重载：方法名称相同，参数不同；
 */
public class Student {
    private String name;
    private int age;
    public Student(String name, int age){
        System.out.println("含参数构造方法");
        this.age = age;
        this.name = name;
    }
    public Student(){
        System.out.println("无参数构造");
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age=age;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

}
