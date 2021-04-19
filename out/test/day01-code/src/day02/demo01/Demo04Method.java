package day02.demo01;

public class Demo04Method {
    public static void main(String[] args) {
        sum();
    }
    public static void sum(){
        int result=0;
        for(int i=1;i<=100;i++){
            result += i;
        }
        System.out.println(result);
    }
}
