package day03.demo;
/*
    数组元素反转：
       对称位置交换；

 */

public class Demo03Array {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6};
        int j=array.length-1;
        int temp;
        for(int i=0;i<array.length/2;i++){
            temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            j--;
        }
        for(int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }
}
