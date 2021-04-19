package Day09;
/*
在任何版本的java中，都能定义抽象方法;

public abstract 返回值类型 方法名称(参数列表);

注意事项:
1.接口当中的抽象方法,修饰符必须是两个固定的关键字:public abstract
2.两个关键字修饰符,可省略;
3.方法的三要素可以随意定义;
 */
public interface MyInterfaceAbstract {

    //这是一个抽象方法
    public abstract void methodAbs1();

    //同样都是抽象方法
    public void methodAbs2();
    abstract void methodAbs3();
    void methodAbs4();
}
