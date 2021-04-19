package Demo08;

public class Demo10Ticket {
    public static void main(String[] args) {
        Demo10Lock run = new Demo10Lock();
        System.out.println("run:"+run);
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        //调用start方法开启线程
        t0.start();
        t1.start();
        t2.start();
    }
}
