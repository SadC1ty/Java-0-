package day04;
import java.util.Scanner;
/*
键盘输入两个数字求和
 */
public class Demo02ScannerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1=sc.nextInt();
        System.out.println("输入的第一个数字："+ num1);
        int num2=sc.nextInt();
        System.out.println("输入的第二个数字："+ num2);
        int sum = num1+num2;
        System.out.println("求和："+num1+"+"+num2+"="+sum);
    }
}
