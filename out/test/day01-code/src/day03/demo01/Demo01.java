package day03.demo01;
import java.util.Arrays;

public class Demo01 {
    public static void main(String[] args) {
        int[] array= {1,2,3,4,5};
        //面向过程

        for(int i=0;i<array.length;i++){
            if(i == array.length-1){
                System.out.println(array[i]);
                break;
            }
            System.out.print(array[i]+", ");
        }

        System.out.println("=========");

        //面向对象
        System.out.println(Arrays.toString(array));
    }
}
