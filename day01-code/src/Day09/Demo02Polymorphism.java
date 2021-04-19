package Day09;
/*
访问成员变量的两种方式
1.成员变量不能覆盖重写,等号左边是Fu类,所以返回的是父类的成员变量值
2.间接使用成员方法访问成员变量,成员方法可以被覆盖重写,看运行方法属于哪个类
 */
public class Demo02Polymorphism {
    public static void main(String[] args) {
        Fu obj = new Zi();
        System.out.println(obj.num);    //10
        System.out.println("=====");
        obj.showNum();  //20
    }
}
