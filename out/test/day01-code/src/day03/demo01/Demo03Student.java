package day03.demo01;
//同属于一个package，可以省略导包过程
//import day03.demo01.Demo02Student;
/*
    1.导包
    2.创建，格式：
        类名称 对象名称= new 类名称（）
    3.使用：
        使用成员变量：对象名，成员变量名；
        使用成员方法：对象名，成员方法名（参数）；
 */
public class Demo03Student {
    public static void main(String[] args) {
        Demo02Student stu = new Demo02Student();
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println("===============");
        stu.name="SadC1ty";
        stu.age = 20;
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println("===============");
        stu.eat();
        stu.sleep();
        stu.study();
    }
}
