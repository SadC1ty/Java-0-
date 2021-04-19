package day02.demo01;

public class Demo03Method {
    public static void main(String[] args) {
        System.out.println(compareNums(10,20));
    }
    public static boolean compareNums(int nums1,int nums2){
        /*if(nums1==nums2) {
            return true;
        }
        return false;*/

        /*
        boolean same = nums1 == nums2;
        return  same;
        */
        return nums1 == nums2;
    }
}
