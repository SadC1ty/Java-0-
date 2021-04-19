package Day08;
//定义了一个子类:讲师
public class Teacher extends Employee {
    double salary;
    int num =200;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void methodT(){
        int num = 300;
        System.out.println(num);    //300
        System.out.println(this.num);   //200
        System.out.println(super.num);  //100
    }
    public void method(){
        System.out.println("子类重名方法执行!");
    }
}
