package day04;
/*
题目:定义4个学生对象，添加到集合并遍历;
 */
import java.util.Scanner;
import java.util.ArrayList;
public class Demo12ArrayListTest2 {
    public static void main(String[] args) {
        ArrayList<Student> listS = new ArrayList<Student>();
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++){
            System.out.println("输入学生姓名");
            String name = sc.next();
            System.out.println("输入学生年龄");
            int age = sc.nextInt();
            listS.add(new Student(name,age));
        }
//        Student a = new Student("A",13);
//        Student b = new Student("B",12);
//        Student c = new Student("C",13);
//        Student d = new Student("D",14);
//        listS.add(a);
//        listS.add(b);
//        listS.add(c);
//        listS.add(d);
        for(int i=0;i<listS.size();i++){
            System.out.println("第"+(i+1)+"位学生姓名:"+listS.get(i).name+"年龄:"+listS.get(i).age);
        }
    }
}
