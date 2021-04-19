package Demo01;
/*
    java.lang.Object
    类Object是类层次结构的根类
    每个类都使用Object类作为超(父)类
    所有对象(包括数组)都实现这个类的方法
 */
public class Demo01Object {
    public static void main(String[] args) {
        //Person类默认继承了Object类
        Person a = new Person("A",10);
        /*
            打印出来的是a在堆内存中地址值;
            toString重写后，返回的是类的属性
         */
        String str = a.toString();
        System.out.println(str);    //重写前:地址值;重写后:A
    }
}
