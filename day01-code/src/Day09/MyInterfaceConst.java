package Day09;
/*
接口中可以定义"成员变量",但是必须使用public static final三个关键字进行修饰
从效果上看,相当于常量;
格式
public static final 数据类型 常量名称 = 数量值
备注:
final关键字进行修饰,说明不可改变;

注意事项：
1.接口当中的常量可以省略public static final;
2.接口当中的常量必须进行赋值
3.接口当中的常量,使用完全大写的字母,用下划线修饰
 */
public interface MyInterfaceConst {
    //一个常量
    public static final int NUM = 10;

}
