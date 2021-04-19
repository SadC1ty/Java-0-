package Day10;
/*
final关键字代表不可改变
常见四种用法：
1.可以用来修饰一个类
2.可以用来修饰一个方法
3.可以用来修饰一个局部变量
4.可以用来修饰一个成员变量

注意事项
对于类、方法来说，abstract关键字和final关键字不能同时使用，因为矛盾
 */
public class Demo01Final {
    public static void main(String[] args) {
        int num  = 10;
        System.out.println(num);
        num = 20;
        System.out.println(num);
        //一旦使用final修饰局部变量，一旦赋值不再改变
        final int num1 = 100;
        System.out.println(num1);

        final int num2;
        num2 = 30;

        //对于基本类型来说，不可变是变量当中的数据不可变;
        //对于引用类型来说，不可变是引用的地址不可变;
    }
}
