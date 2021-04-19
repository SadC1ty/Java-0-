package Day09;
/*
成员方法的使用
在多态的代码中,成员方法的访问规则是:
    看new的是谁,就优先用谁,没有则向上找
 */
public class Demo03Polymorphism {
    public static void main(String[] args) {
        Fu obj = new Zi();

        obj.method();   //优先用子类方法
        obj.methodFu(); //父类特有方法

        //obj.methodZi();   //  子类特有方法,错误写法,编译看左,父类没有子类特有方法

    }
}
