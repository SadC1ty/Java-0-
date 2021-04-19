package day04;
import java.util.ArrayList;
import java.util.Random;
/*
题目:生成6个1-33之间的随机整数;添加到集合,并遍历集合;
 */
public class Demo11ArrayListTest1 {
    public static void main(String[] args) {
        ArrayList<Integer> listNum = new ArrayList<Integer>();
        Random one = new Random();

        for(int i=0;i<6;i++){
            int num = one.nextInt(33)+1;
            listNum.add(num);
        }
        int listSize = listNum.size();
        System.out.println("集合长度:"+listSize);
        for(int j=0;j<listSize;j++){
            int flag = listNum.get(j);
            System.out.println("第"+(j+1)+"号元素为:"+flag);
        }
    }
}
