package day04;
/*
题目:定义一个方法,以ArrayList作为参数,使用{}扩起集合,使用@分割每个元素,格式参照{元素@元素@元素}
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Demo13ArrayListTest3 {
    public static void main(String[] args) {
        ArrayList<Integer> nums= new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        System.out.println("输入集合长度");
        int num=sc.nextInt();


        for(int i=0;i<num;i++){
            System.out.println("输入第"+(i+1)+"位元素");
            nums.add(sc.nextInt());
        }
        ArrayListPrint(nums);
    }

    public static void ArrayListPrint(ArrayList<Integer> num){
        for(int i=0;i<num.size();i++) {
            if (i == 0) {
                System.out.print("{"+num.get(i)+"@");
                continue;
            }
            if(i==num.size()-1){
                System.out.print(num.get(i)+"}");
                break;
            }
            System.out.print(num.get(i)+"@");
        }
    }
}
