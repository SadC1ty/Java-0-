package Day08;
//定义一个父类
public class Employee {
    int age;
    String name;
    int num =100;

    public Employee() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void method(){
        System.out.println("父类重名方法执行!");
    }

    public void methodE(){
        //使用本类当中的num,不会向下找子类;
        System.out.println(num);
    }
}
