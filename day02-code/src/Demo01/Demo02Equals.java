package Demo01;
/*
    Person类默认继承Object类
    boolean Equals方法指示其他某个对象是否与此对象"相等"
    默认比较的是对象的地址值，需要重写;
 */
public class Demo02Equals {
    public static void main(String[] args) {
        Person a = new Person("A",15);
        Person b = new Person("B",16);

        boolean temp=a.equals(b);    //比较的是地址值;
        System.out.println(temp);       //重写前:false;重写后:true
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
}
