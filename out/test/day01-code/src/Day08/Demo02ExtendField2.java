package Day08;
/*
局部变量: 直接写成员变量名;
本类的成员变量: this修饰;
父类的成员变量: super修饰;

在父子类的继承关系当中,创建子类对象,访问成员方法的规则;
    创建的对象是谁,就优先用谁,如果没有就向上找

注意事项:
    无论是成员方法还是成员变量,如果没有都是向上找父类;
 */
public class Demo02ExtendField2 {
    public static void main(String[] args) {
        Teacher one = new Teacher();
        one.methodT();// 300 200 100

        one.method();   //优先使用的是子类的方法;
    }
}
