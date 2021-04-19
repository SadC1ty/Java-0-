package Day07;
/*
将一个字符串中的所有字符升序排列,并倒序打印;
 */
import java.util.Arrays;
import java.util.Scanner;
public class Demo02ArraysTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ans = sc.next();
        char[] ansArray = ans.toCharArray();
        Arrays.sort(ansArray);
        for (int i = ansArray.length - 1; i >= 0; i--) {
            System.out.print(ansArray[i]);
        }
    }
}
