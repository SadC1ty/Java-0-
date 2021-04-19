package Demo08;
//设置一个Thread的子类
public class Demo02MyThread extends Thread {
    @Override
    public void run(){
        //String name = getName();
        //System.out.println(name);
        //System.out.println("==============");
        //Thread t = currentThread();
        //System.out.println(t);
        //String name = t.getName();
        //System.out.println(name);
        System.out.println(Thread.currentThread().getName());
    }
}
