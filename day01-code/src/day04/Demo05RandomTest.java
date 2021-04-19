package day04;
import java.util.Random;
import java.util.Scanner;
/*
练习:要求随即取到[1,n]
 */
public class Demo05RandomTest {
    public static void main(String[] args) {
        Random one = new Random();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = one.nextInt(n)+1;
        System.out.println("要求区间是[1,"+n+"],随机生成的数是:"+ num);
    }
}
