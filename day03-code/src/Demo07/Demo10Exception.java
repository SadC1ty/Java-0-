package Demo07;

import java.util.Scanner;

/*
    要求: 我们模拟注册,如果用户名已经存在,则抛出异常并提示：已经注册过用户名

    分析:
        1.使用数组保存已经注册过的用户名
        2.使用Scanner获取用户输入的用户名
        3.定义一个方法,对用户输入的用户名进行判断
            遍历存储已经存储注册过用户名的数组,获取每一个用户名
            使用获取到的用户名和用户输入的用户名进行比较
            如果循环结束没有重复用户名,注册成功
 */
public class Demo10Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入注册的用户名");
        String username = sc.next();
        try {
            checkName(username);
        }catch (RegisterException e){
            System.out.println(e);
        }
    }
    static String[] usernames = {"a","b","c"};

    private static void checkName(String username) throws RegisterException {
        for(String name : usernames){
            if(name.equals(username)){
                throw new RegisterException("用户名已经被注册");
            }
        }
        System.out.println("注册成功");
    }
}
