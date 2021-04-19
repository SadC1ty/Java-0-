package day02.demo01;

public class Demo02Method {
    public static void main(String[] args) {
        //直接调用
        sum(10,20);
        System.out.println("**********");
        //打印调用
        System.out.println(sum(10,20));
        System.out.println("**********");
        //赋值调用
        int result=sum(10,20);
        System.out.println(result);
    }
    public static int sum(int a,int b) {
        System.out.println("方法执行！");
        int result = a + b;
        return  result;
    }
}
