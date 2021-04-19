package day04;
import java.util.ArrayList;
import java.util.Random;
/*
ArrayList中的常用方法:
1.public boolean add(E,e): 向集合当中添加元素,参数类型与泛型一致;返回值代表是否添加成功
2.public E get(int index): 从集合当中获取元素,参数是索引编号,返回值就是对应位置的元素;
3.public E remove(int index): 从集合当中删除元素，参数是索引编号,返回值就是被删除的元素;
4.public int size(): 获取集合的长度;
 */
public class Demo09ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<Integer>();
        Random r=new Random();
        //随机数充填数组;
        for(int i=0;i<10;i++){
            int a = r.nextInt(100)+1;
            nums.add(a);
        }
        //获取集合长度
        int length = nums.size();
        System.out.println("集合长度为:"+length);

        //获取元素
        int num6=nums.get(5);
        System.out.println("第6号元素是："+num6);

        //删除元素
        int num3 = nums.remove(3);
        System.out.println("删除第3号的元素:"+num3);
        int length2 = nums.size();
        System.out.println("删除元素后集合长度为:"+length2);
    }
}
