import java.util.*;

public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = sc.nextInt();
        List<Integer> nums = new ArrayList<Integer>();
        for(int i=1;i<n+1;i++){
            nums.add(i);
        }
        int flag = 0;
        int temp = 0;
        int temp1 = 0;
        for(int i = 0;i<2*count;i++) {
            flag++;
            int numa = sc.nextInt();
            numa--;
            if (flag % 2 != 0) {
                temp1 = nums.get(numa);
                temp = numa;
            }
            else {
                int temp2 = nums.get(numa);
                nums.set(temp, temp2);
                nums.set(numa, temp1);
            }
        }
        for(int i :nums){
            System.out.print(i+" ");
        }
    }
}
