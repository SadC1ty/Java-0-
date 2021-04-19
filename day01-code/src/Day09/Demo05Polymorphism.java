package Day09;
/*
向下转型
格式:
子类名称 对象名 = (子类名称)父类对象;
含义:
将父类对象,【还原】成为本来的子类对象
 */
public class Demo05Polymorphism {
    public static void main(String[] args) {
        Fu obj1 = new Zi();
        Zi obj2 = (Zi) obj1;

        obj2.methodZi();
    }
}
