package Day08;
/*
在继承的关系中,"子类就是父类",子类可以被当作父类看待;
例如父类是员工,子类是讲师,那么"讲师就是员工";

定义父类的格式:
public class 父类名称{
    //...
}

定义子类格式:
public class 子类名称 extends 父类名称{
    //...
}
 */
public class Demo01Extends {
    public static void main(String[] args) {
        //创建一个子类对象
        Teacher one = new Teacher();
        one.method();   //方法执行
    }
}
