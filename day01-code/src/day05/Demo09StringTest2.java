package day05;
/*
题目:键盘输入一个字符串,并且统计其中各种字符出现的次数;
种类:大写字母,小写字母,数字,其他;
 */
import java.util.Scanner;
public class Demo09StringTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sort(str);
    }

    public static void sort(String str){
        char[] strArray = str.toCharArray();
        int countS=0;
        int countB=0;
        int countN=0;
        int countO=0;
        for (int i = 0; i < strArray.length; i++) {
            if(strArray[i]>47&&strArray[i]<58){
                countN++;
                continue;
            }
            if(strArray[i]>64&&strArray[i]<91){
                countB++;
                continue;
            }
            if(strArray[i]>96&&strArray[i]<123){
                countS++;
                continue;
            }
            countO++;
        }
        System.out.println("大写字母次数:"+countB+"小写字母次数:"+countS+"数字次数:"+countN+"其他:"+countO);
    }

}
