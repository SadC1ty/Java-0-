package Day07;
/*
题目:计算在-1000.5到200.9之间,绝对值大于50.1,小于400.5的整数有多少个
 */
public class Demo04MathTest {
    public static void main(String[] args) {
        int numCount=0;

        double min = -1000.5;
        double max = 200.9;
        for (int i=(int) min;i<max;i++ ){
            if(Math.abs(i)>Math.abs(50.1)&&Math.abs(i)<Math.abs(400.5)){
                numCount++;
            }
        }
        System.out.println(numCount);
    }
}
