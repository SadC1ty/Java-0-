package Demo08;
/*
    主线程: 执行主(main)方法的线程

    单线程程序: java程序中只有一个线程
    执行从main()方法开始,从上到下依次进行
 */
public class Demo01MainThread {
    public static void main(String[] args) {
        Peron p1= new Peron("a");
        p1.run();

        Peron p2 = new Peron("b");
        p2.run();
    }
}
