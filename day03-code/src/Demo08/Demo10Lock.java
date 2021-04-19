package Demo08;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
    卖票案例出现了线程安全问题;
    卖出了不存在的票和重复的票;

    解决线程安全问题的一种方案:使用Lock锁
    java.util.concurrent.locks.Lock接口
    Lock实现提供了比使用synchronized方法和语句可获得的更广泛的锁定操作;
    Lock接口中的方法:
        void lock()获取锁;
        void unlock()释放锁;
    java.util.concurrent.locks.ReentrantLock implements Lock接口

    使用步骤:
        1.在成员位置创建一个ReentrantLock对象
        2.在可能会出现安全问题的代码前调用Lock接口方法中的lock方法获取锁
        3.在可能会出现安全问题的代码后调用Lock接口方法中的unlock方法释放锁
 */
public class Demo10Lock extends RunnableImpl {
    private static int ticket = 100;

    //创建一个锁对象
    Lock l = new ReentrantLock();

    //实现线程任务卖票
    @Override
    public void run() {
        System.out.println("this："+this);
        //使用死循环,实现卖票
        while(true) {
            //在可能出现安全问题的代码前调用Lock接口中的方法Lock获取锁
            l.lock();

            if (ticket > 0) {
                //提高安全问题出现的概率,让程序睡眠
                try {
                    Thread.sleep(100);
                    System.out.println(Thread.currentThread().getName() + "-->正在卖" + ticket + "张票");
                    ticket--;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }finally {
                    //无论是否程序出现异常,都会释放锁
                    l.unlock();
                }
            }
        }
    }


}
