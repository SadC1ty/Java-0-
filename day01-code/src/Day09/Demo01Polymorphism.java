package Day09;
/*
代码当中体现多态性：父类应用指向子类对象
格式
父类名称 对象名 = new 子类名称();
接口名称 对象名 = new 实现类名称();
 */
public class Demo01Polymorphism {
    public static void main(String[] args) {
        Fu obj = new Zi();
        obj.method();//这是一个子类方法
    }
}
