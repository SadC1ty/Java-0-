package day03.demo01;

public class Demo04Person {
    public static void main(String[] args) {
        person one = new person();
        one.show();
        System.out.println("=====");
        /*
            错误的写法，因为age被private关键字修饰
            one.age = 20;
         */
        one.setAge(20);
        one.name = "SadC1ty";
        one.show();
    }
}
