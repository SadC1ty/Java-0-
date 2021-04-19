package Demo08;
/*
    public static void sleep(long millis):
    使当前正在执行的线程以指定的毫秒数暂停（暂时停止执行），具体取决于系统定时器和调度程序的精度和准确性。 线程不会丢失任何显示器的所有权。
    毫秒数结束之后,线程继续执行

 */
public class Demo04Thread {
    public static void main(String[] args) {
        //模拟秒表
        for (int i = 0; i <60;i++) {
            System.out.println(i);

            //使用sleep方法让程序睡眠1秒钟
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
