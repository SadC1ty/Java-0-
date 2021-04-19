package day03.demo;
/*
    寻找极值
 */
public class Demo04Array {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int max=array[0];
        for(int i=1;i<array.length;i++){
            if(max<array[i]){
                max=array[i];
            }
        }
        System.out.println("数组最大值："+ max);
        System.out.println("==================");
        int min=array[0];
        for(int i=1;i<array.length;i++){
            if(min>array[i]){
                min = array[i];
            }
        }
        System.out.println("数组最小值："+min);
    }
}
