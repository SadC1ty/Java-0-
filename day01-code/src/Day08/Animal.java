package Day08;
/*
抽象方法：就是加上abstract关键字，加上去掉大括号，直接分号结束
抽象类：抽象方法所在的类，在class之前协商abstract即可

如何使用抽象类和抽象方法：
1.不能直接new抽象类对象；
2.必须用子类来继承抽象类
3.Override重写抽象类中的抽象方法
4.创建子类对象进行使用
 */
public abstract class Animal {
    //抽象方法，代表吃这个动作，但是具体内容不确定
    public abstract void eat();
    //普通成员方法
    public void methodA(){
        System.out.println("普通成员方法");
    }
}
