package day06;
/*
如果一个成员变量,使用了static关键字,那么这个变量不再属于对象自己,而是属于自己所在的类,多个对象共享同一份数据;
 */
public class Demo01StaticField {
    public static void main(String[] args) {
        Student one = new Student("A",15);
        Student two = new Student("B",16);
        one.setClassroom("102教室");

        System.out.println("学生姓名:"+one.getName()+"学生年龄:"+one.getAge()+"教室:"+one.getClassroom());
        System.out.println("学生姓名:"+two.getName()+"学生年龄:"+two.getAge()+"教室:"+two.getClassroom());
    }
}
