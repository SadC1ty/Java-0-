package Day07;
import java.util.Arrays;
/*
public static String toString(数组): 将参数数组变成了字符串;
public static void sort(数组):按照数组默认升序(从小到大)对数组的元素进行排序;

备注:
1.如果是数值,sort默认按照升序从小到大;
2.如果是字符串,sort默认按照字母顺序;
3.如果是自定义的类,那么这个自定义的类需要有Comparable或者Comparator的支持
 */
public class Demo01Arrays {
    public static void main(String[] args) {
        int[] intArrays= {10,20,30};

        String intStr = Arrays.toString(intArrays);
        System.out.println(intStr);//[10,20,30]

        int[] intArray1={1,3,42,323,12,32};
        Arrays.sort(intArray1);
        System.out.println(Arrays.toString(intArray1));//[1,3,12,32,42,323]

        String[] array2= {"bbb","aaa","ccc"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));//[aaa,bbb,ccc]
    }
}

