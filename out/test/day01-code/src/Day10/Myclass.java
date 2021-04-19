package Day10;
/*
当final关键字用来修饰一个类的时候，格式;
public final class 类名称{
    //...
}

含义：当前这个类不能有任何的子类
 */
public final class Myclass /* extends Object */{
    public void method(){
        System.out.println("方法执行");
    }
}
