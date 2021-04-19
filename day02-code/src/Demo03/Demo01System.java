package Demo03;
/*
    Java.lang.System类,直接调用其中方法
    System类中有大量的静态方法,可以获取系统相关的信息和系统操作
    常用的方法：
        1.public static long currentTimeMillis();返回以毫秒为单位的当前时间
        2.public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length):拷贝数组
 */
public class Demo01System {
    public static void main(String[] args) {
        //demo01();
        demo02();
    }
    //练习调用public static long currentTimeMillis();
    private static void demo01(){
        //程序执行前获得一次毫秒值
        long a = System.currentTimeMillis();
        for(int i = 1 ;i<100;i++){
            System.out.println(i);
        }
        long b = System.currentTimeMillis();
        long ans = b-a;
        System.out.println(ans);
    }
    /*
        练习调用public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length)
        参数:
            src - 原数组;
            srcPos - 原数组的起始位置;
            dest - 目标数组;
            destPos  - 目标数组中的起始位置;
            length - 要复制的数组元素的数量;
        练习:
            将src数组中的前3个元素,复制到dest数组的前三个位置上
    */
    private static void demo02(){
        int[] a = {1,2,3,4};
        int[] ans = {6,7,8,9};
        //调用arraycopy方法
        System.arraycopy(a,0,ans,0,3);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }

}
