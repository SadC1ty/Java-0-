package day05;
/*
题目:定义一个方法,把数组{1,2,3}按照指定格式拼接成一个字符串,格式参照如下:[word1#word2#word3]
 */
import java.util.ArrayList;
public class Demo08StringTest1 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        String ansStr= fromArraytoString(nums);
        System.out.println("转换后的字符串:"+ansStr);
    }
    public static String fromArraytoString(int[] nums){
        String ansStr = new String();
        String str1 ="[";
        String str2="]";
        ansStr+=str1;
        for (int i=0;i<nums.length;i++) {
            if(i==nums.length-1){
                ansStr+="word"+nums[i]+"]";
                break;
            }
            ansStr += "word"+nums[i]+"#";
        }
        return ansStr;
    }
}
