package Demo08;

public class Demo03MyThread extends Thread{
    public Demo03MyThread(){

    }

    public Demo03MyThread(String name){
        super(name);//把线程名称传递给父类,让父类(Thread)给子线程起一个名字
    }

    @Override
    public void run(){
        //获取线程名称
        System.out.println(Thread.currentThread().getName());
    }
}
