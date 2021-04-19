package day02.demo01;

public class Demo06Method {
    public static void main(String[] args) {
        System.out.println(same((byte)2,(byte)2));
        System.out.println(same(129,129));
    }
    public static boolean same(int num1,int num2){
        System.out.println("调用的是int型");
        return num1==num2;
    }
    public static boolean same(byte num1,byte num2){
        System.out.println("调用的是byte型");
        return num1==num2;
    }
}
