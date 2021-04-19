package day03.demo01;
/*
    private的使用
    问题：为了防止不合理的参数被设置进来；
    解决：使用private关键字将需要保护的成员变量进行修饰；

    一旦使用了private修饰成员变量，那么本类中可以正常访问；
    超出本类范围外的就不能再直接访问了
 */
public class person {
    private int age;
    String name;

    public void show(){
        System.out.println("年龄"+age);
        System.out.println("姓名"+name);
    }

    //数据赋值
    public void setAge(int num){
        age=num;
    }

    //用于获取数据
    public int getAge(){
        return age;
    }
}
