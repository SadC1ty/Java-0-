package Day09;
/*
接口就是多个类的公共规范;
接口就是一种引用的数据类型,最重要的内容是其中的抽象方法;

如何定义一个接口
public interface 接口名称{
    //接口内容

}

注意:换成了关键字interface之后,编译生成的字节码文件仍然是:.java->.class;

备注:接口中可以包含的内容
java7:1.常量;2.抽象方法;
java8:3.默认方法;4.静态方法；
java9:5.私有方法;

接口使用步骤:
1.接口不能直接使用,必须要有一个实现类实现接口;
格式:
public class 实现类名称 implements 接口名称{
    //。。。
}
2.接口的实现类,必须覆盖重写接口中所有的抽象方法;
去掉abstract关键字,加上方法体大括号;
3.创建实现类的对象进行使用;

注意事项:
如果实现类,没有覆盖重写接口中所有的抽象方法,那么这个实现类自己就必须是抽象类
 */
public class Demo01Interface {
    public static void main(String[] args) {
        MyInterfaceAbstractimpl a = new MyInterfaceAbstractimpl();
        a.methodAbs1();//第一个方法
        a.methodAbs2();//第二个方法
        a.methodAbs3();//第三个方法
        a.methodAbs4();//第四个方法
    }
}
