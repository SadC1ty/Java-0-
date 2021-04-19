package Day09;
/*
从java 8开始:接口允许定义默认方法;
格式:
public default 返回值类型 方法名称(参数列表){
    方法体
}

备注: 接口当中的默认方法,可以解决接口升级的问题;
 */
public interface MyInterfaceDefault {
    //抽象方法
    public abstract void method();

    //想要新添加的方法
    //public abstract void method2();
    //新添加的方法改为默认方法
    //public 可以省略
    public default void method2(){
        System.out.println("这是新添加的默认方法");
    }
}
