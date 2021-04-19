package Demo08;
/*
    模拟卖票案例
    船舰3个线程,同时开启，对共享的票进行出售
 */
public class Demo08Ticket {
    public static void main(String[] args) {
        //创建Runnable接口的实现类对象
        Demo08RunnableImpl run = new Demo08RunnableImpl();

        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        //调用start方法开启线程
        t0.start();
        t1.start();
        t2.start();
    }
}
