package day04;
/*
题目要求:定义一个数组,存储三个Person对象;
 */
public class Demo07Array {
    public static void main(String[] args) {
        //创建一个长度为3的数组
        Person []array = new Person[3];

        Person a = new Person("A",15);
        Person b = new Person("B",20);
        Person c = new Person("C",18);

        array[0]=a;
        array[1]=b;
        array[2]=c;

        System.out.println(array[0]);
    }
}
