package Day08;
/*
继承关系中,父子类构造方法的访问特点;
1.子类构造方法当中有一个默认隐含的"super()"调用,所以先调用父类构造方法,在调用子类构造方法;

2.可以通过super关键字来调用父类的重载构造;
3.super的父类构造,必须是子类构造方法第一个语句,不能一个子类构造调用多次super构造;
总结:
子类必须调用父类构造方法;
 */
public class Demo03Constructor {
    public static void main(String[] args) {
        Fu a = new Fu();//调用无参构造
        Zi b = new Zi();//调用有参构造;调用子类的无参构造
    }
}
