package day06;

public class Student {
    private String name;
    private int age;

    static String classroom;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getClassroom() {
        return classroom;
    }

    public static void setClassroom(String classroom) {
        Student.classroom = classroom;
    }
}
