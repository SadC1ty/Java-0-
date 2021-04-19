package day03.demo;

public class Demo02Array {
    public static void main(String[] args) {
        //静态初始化
        int[] array = {10,20,30};
        System.out.println(array);    //直接打印数组得到的是内存地址哈希值
        //访问数组元素
        System.out.println(array[0]);   //打印数组元素
        //赋值
        int num = array[0];
        System.out.println(num);
        //动态初始化
        System.out.println("==========");
        int[] array2 = new int[3];

        array2[0] = 10;    //简单赋值
        array2[1] = 20;
        array2[2] = 30;
        System.out.println(array2[0]);
    }
}
