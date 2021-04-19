package day03.demo;

public class Demo01Array {
    public static void main(String[] args) {
        //动态初始化数组：直接指定长度
        int[] numsA = new int[300];  //创建300个数据长度的int型数组

        //静态初始化数组: 直接指定数据
        int[] numsB = new int[] {1,2,3,4,5,6};  //创建数组内容为1，2，3，4，5，6的数组

        //静态化省略格式
        int[] numsC = {1,2,3,4,5,6};
    }
}
