package day02.demo01;

public class Demo05Method {
    public static void main(String[] args) {
        printHelloWorld(100);
    }
    public static void printHelloWorld(int num){
        for(int i =0;i<num;i++){
            System.out.println("Hello,World!" + i);
        }
    }
}
