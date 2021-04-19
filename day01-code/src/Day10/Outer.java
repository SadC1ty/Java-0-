package Day10;
/*
如果一个类是定义在在一个方法内部的,那么这就是一个局部内部类;
"局部",只有当前所属的方法才能使用他,出了这个方法外面就不能使用了：
 */
public class Outer {
    int num = 10;

    public class Inner{
        int num = 20;

        public void methodInner(){
            int num = 30;
            System.out.println(num);    //局部变量,就近原则 30
            System.out.println(this.num);   //20
            System.out.println(Outer.this.num); //10
        }
    }
}
