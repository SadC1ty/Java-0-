package day04;
/*
题目:
用一个大集合中存放了20个随机数,筛选其中的偶数元素，放入小集合中遍历;
 */
import java.util.Random;
import java.util.ArrayList;
public class Demo14ArrayListTest4 {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> nums = new ArrayList<>();
        for(int i=0;i<20;i++){
            int num=r.nextInt();
            nums.add(num);
        }
        ArrayList<Integer> aNum= new ArrayList<>();
        aNum = numChoose(nums);
        System.out.println("遍历小集合(偶数集合)");
        for(int i=0;i<aNum.size();i++){
            System.out.println("第"+(i+1)+"位元素:"+aNum.get(i));
        }
        System.out.println("遍历原本集合(奇数集合)");
        for(int i=0;i<nums.size();i++){
            System.out.println("第"+(i+1)+"位元素:"+nums.get(i));
        }
    }

    public static ArrayList<Integer> numChoose(ArrayList<Integer> num){
        ArrayList<Integer> aNum = new ArrayList<Integer>();
        for(int i=0;i<num.size();i++){
            int nums= num.get(i);
            if(nums%2==0){
                aNum.add(nums);
                num.remove(i);
                continue;
            }
        }
        return aNum;
    }
}
