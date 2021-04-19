package Day10;
/*
对于成员变量来说,如果使用final关键字,那么成员变量也是不可变的;
1.由于成员变量具有默认值,用了final关键字修饰之后必须手动赋值,不会再给默认值;
2.对于final的成员变量,要么使用直接赋值,要么通过构造方法进行赋值,二者选其一;
3.必须保证类当中所有的重载的构造方法,都最终会对final的成员变量进行赋值;
 */
public class Person {
    private final String name;
    public Person(){
        name = "xxx";
    }
    public Person(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
}
