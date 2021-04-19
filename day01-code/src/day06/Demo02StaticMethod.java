package day06;
/*
一旦使用static修饰成语方法,那么就成为了静态方法;
静态方法,不属于对象,而是属于类;

注意:
1.静态不能直接访问非静态;
原因:内存中现有静态,后有非静态：
2.静态方法中不能用this;
原因:this代表当前对象,
 */
public class Demo02StaticMethod {
    public static void main(String[] args) {
        MyClass obj = new MyClass();   //创建对象

        obj.method();      //调用成员方法
        obj.methodStatic(); //不会报错,不推荐,会误以为是一个成员方法
        //对于静态方法,可以通过对象名进行调用,也可以直接通过类名称来调用
        MyClass.methodStatic();//推荐写法

        //本类中的静态方法,可以省略类名
        myMethod();
    }
    public static void myMethod(){
        System.out.println("本类中的静态方法");
    }
}
