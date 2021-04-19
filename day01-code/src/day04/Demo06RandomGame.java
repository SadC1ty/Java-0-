package day04;
import java.util.Random;
import java.util.Scanner;
/*
随机数小游戏:产生一个随机数字,直至猜对结束;
 */
public class Demo06RandomGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random one = new Random();
        int ans = one.nextInt(100)+1;   //1~100
        while(true){
            int guess = sc.nextInt();
            if(guess>ans){
                System.out.println("输入过大，请重新输入");
            }
            if(guess<ans){
                System.out.println("输入过小，请重新输入");
            }
            if(guess==ans){
                System.out.println("输入正确!");
                break;
            }
        }
    }
}
