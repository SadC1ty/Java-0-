package Demo02;
/*
    测试含有泛型的方法
 */
public class Demo03Generic {
    public static void main(String[] args) {
        //创建一个GenericMethod对象
        GenericMethod gm = new GenericMethod();
        /*
            调用含有泛型的方法
         */

        gm.method01("ABCD");
        gm.method01(123);
        gm.method01(true);

        gm.method02("123");//不推荐创建对象使用，静态方法的调用可以直接使用类名调用
        GenericMethod.method02("abc");

    }
}
