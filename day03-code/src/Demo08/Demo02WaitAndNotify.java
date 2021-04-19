package Demo08;
/*
    进入到TimeWaiting(计时等待)有两种方式;
    1.使用sleep(long m)方法,在毫秒值结束之后,线程唤醒进入到Runnable/Blocked状态;
    2.使用wait(long m)方法，wait方法如果在毫秒值之后,还没有被notify唤醒,就会自动醒来,线程睡醒进入到Runnable/Blocked状态

    唤醒的方法:
        public final void notify()唤醒正在等待对象监视器的单个线程
        public final void notifyAll()唤醒正在等待对象监视器的所有线程
 */
public class Demo02WaitAndNotify {
    public static void main(String[] args) {
        //创建锁对象
        Object obj = new Object();
        //创建A线程
        new Thread(){
            @Override
            public void run(){
                //保证等待和唤醒的线程只能有一个执行,需要使用同步技术;
                synchronized (obj){
                    System.out.println("A告知需求");
                    try {
                        //5s后自动醒来
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("A验收工作完成");
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run(){
                //保证等待和唤醒的线程只能有一个执行,需要使用同步技术;
                synchronized (obj){
                    System.out.println("B告知需求");
                    try {
                        //5s后自动醒来
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("B验收工作完成");
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run(){
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (obj){
                    System.out.println("完成需求,唤醒线程");
                    //调用notifyAll()方法唤醒所有等待的线程
                    obj.notifyAll();
                }
            }
        }.start();
    }
}
