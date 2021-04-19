package Demo08;
/*
    实现卖票案例
 */
public class Demo07RunnableImpl implements Runnable{
    //定义一个多个线程共享的票源
    private int ticket = 100;

    //实现线程任务卖票
    @Override
    public void run() {
        //使用死循环,实现卖票
        while(true){
            //如果票存在
            if(ticket>0){
                //提高安全问题出现的概率,让程序睡眠
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println(Thread.currentThread().getName()+"-->正在卖"+ticket+"张票");
                ticket--;
            }
        }
    }
}
