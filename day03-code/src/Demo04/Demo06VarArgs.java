package Demo04;
/*
    JDK1.5之后出现的新特性
    是由前提:
        当方法的参数列表数据类型已经确定，但是参数的个数不确定,就可以使用可变参数
    使用格式:
        修饰符 返回值类型 方法名(数据类型...变量名)
    可变参数的原理:
        可变参数底层就是一个数组,根据传递参数个数不同,会创建不同长度的数组,来存储这些参数
        传递的参数个数，可以是(0,1,2...)
 */
public class Demo06VarArgs {
    public static void main(String[] args) {
        //int i = add();
        int i = add(10,20,30,40,50,60);
        System.out.println(i);
    }
    /*
        定义 0 - n 整数和的方法
        已知:计算整数的和,数据类型是int
        参数个数不确定，可以使用可变参数
        add(): 会创建一个长度为0的数组
        add(10):就会创建一个长度为1的数组,存储传递过来的参数是new int[]{10};
        add(10,20):就会创建一个长度为1的数组,存储传递过来的参数是new int[]{10,20};
     */
    public static int add(int ...arr){
        //System.out.println(arr);//[I@4554617c,底层是一个数组
        //System.out.println(arr.length);//长度为0
        //定义一个初始化变量，记录累加求和
        int sum = 0;
        for(int i : arr){
            sum +=i;
        }
        return sum;
    }
}
