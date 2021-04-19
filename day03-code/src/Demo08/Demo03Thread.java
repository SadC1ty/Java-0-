package Demo08;
/*
    设置线程的名称(了解)
        1.使用Thread类中的方法setName(名字)
            public final void setName(String name)将此线程的名称更改为等于参数name 。
            首先调用这个线程的checkAccess方法，没有参数。 这可能会导致投掷SecurityException
        2.创建一个带参数的构造方法,参数传递线程的名称;调用父类的带参构造方法,把线程名称传递给父类,让父类(Thread)给子线程起一个名字
            public Thread(String name)分配一个新的Thread对象
 */
public class Demo03Thread {
    public static void main(String[] args) {
        Demo03MyThread mt = new Demo03MyThread();
        //第一种方式
        mt.setName("a");
        mt.start();
        //第二种方式
        new Demo03MyThread("b").start();
    }
}
