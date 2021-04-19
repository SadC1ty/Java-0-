package Day10.niMingneibulei;
/*
如果接口的实现类(或者是父类的子类)只需要使用唯一的一次;
那么这种情况下就可以省略该类的定义,而改为使用【匿名内部类】

匿名内部类的定义格式:
接口名称 对象名 = new 接口名称(){
    //覆盖重写接口中所有抽象方法
};

注意事项
1.匿名内部类只能使用唯一一次;
如果希望使用多次,而且内容一样,那么需要一个单独定义的实现类
2.匿名对象,在调用方法的时候只能使用唯一一次
如果希望对象多次调用,那么需要一个单独定义的对象名
3.匿名内部类是省略了【实现类/子类名称】,但是匿名对象是省略了【对象名称】
 */
public class DemoMain {
    public static void main(String[] args) {
//        MyInterfaceImpl obj = new MyInterfaceImpl();
//        obj.method();
        //使用匿名内部类,obj是对象名
        MyInterface obj = new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类覆盖重写");
            }
        };
        obj.method();//匿名内部类覆盖重写
        //使用匿名内部类,并且使用了匿名对象
        new MyInterface(){
            @Override
            public void method(){
                System.out.println("匿名内部类覆盖重写-S");
            }
        }.method(); //匿名内部类覆盖重写-S
    }
}
