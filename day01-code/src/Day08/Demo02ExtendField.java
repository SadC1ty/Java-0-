package Day08;
/*
在父子类的继承关系中,如果成员变量,则创建子类对象时,访问有两种方式;

直接通过子类对象访问成员变量:
    等号左边是谁,则优先用谁,没有则向上找;
间接通过成员方法访问成员变量:
    该方法属于谁,就优先用谁,没有则向上找;
 */

public class Demo02ExtendField {
    public static void main(String[] args) {
        Employee one = new Employee();//创建一个父类对象啊
        one.setAge(15);
        System.out.println(one.age);    //只能是由父类,没有任何子类内容
        System.out.println("========");

        Teacher two =new Teacher();
        two.setAge(20);
        two.setSalary(20000);
        System.out.println(two.age);    //20
        System.out.println(two.salary); //20000.0
        System.out.println("========");

        //等号左边是谁优先用谁
        System.out.println(two.num);    //200
        //这个方法是子类的,优先使用子类,没有再向上找
        two.methodT();     //200
        //这个方法是在父类当中定义的
        two.methodE();  //100

    }
}
