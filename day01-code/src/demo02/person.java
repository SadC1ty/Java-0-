package demo02;
/*
当方法的局部变量和类中的成员变量重名的原则，根据就近原则，优先使用局部变量；
如果需要访问本类中的当中的成员变量，需要使用格式
this.成员变量名

"通过谁调用的方法,谁就是this"
 */
public class person {
    String name;

    public void sayHello(String name){
        System.out.println(name+"你好，我是"+this.name);
    }
}
