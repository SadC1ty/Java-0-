package Demo08;
/*
    获取线程的名称
        1.使用Thread类中的方法getName()
            String getName()返回该线程的名称
        2.可以获取到当前正在执行的线程,使用线程中的方法getName()获取线程的名称
            public static Thread currentThread()返回对当前正在执行的线程对象的引用。
    线程的名称:
        主线程: main
        新线程: Thread-0,Thread-1,...
 */
public class Demo02Thread {
    public static void main(String[] args) {
        //创建Thread的子类对象
        Demo02MyThread mt  = new Demo02MyThread();
        //调用start方法,执行run方法
        mt.start();
        new Demo02MyThread().start();
        new Demo02MyThread().start();
    }
}
