package Demo08;
/*
    等待唤醒案例:线程之间的通信
    创建A线程:告知需求,进入wait状态,等待B线程notify唤醒;
    创建B线程:完成工作,调用notify方法,唤醒A线程

    注意:
        顾客和老板线程必须使用同步代码块包裹起来,保证等待和唤醒只能有一个在执行;
        同步使用的锁对象必须保证唯一
        只有锁对象才能调用wait和notify方法

    Object类中的方法
        public final void wait() throws InterruptedException
            导致当前线程等待，直到另一个线程调用该对象的notify()方法或notifyAll()方法;
        public final void notify()
            唤醒正在等待对象监视器的单个线程。
 */
public class Demo01WaitAndNotify {
    public static void main(String[] args) {
        //创建锁对象
        Object obj = new Object();
        //创建A线程
        new Thread(){
            @Override
            public void run(){
                //保证等待和唤醒的线程只能有一个执行,需要使用同步技术;
                synchronized (obj){
                    System.out.println("告知需求");
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("验收工作完成");
                }
            }
        }.start();

        //创建B线程
        new Thread(){
            @Override
            public void run(){
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (obj){
                    System.out.println("完成需求,唤醒A线程");
                    //调用notify方法唤醒A线程
                    obj.notify();
                }
            }
        }.start();
    }
}
