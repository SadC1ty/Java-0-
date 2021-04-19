package Day09;

public class Zi extends Fu{
    @Override
    public void method(){
        System.out.println("这是一个子类方法");
    }

    int num = 20;
    @Override
    public void showNum(){
        System.out.println(num);
    }
    public void methodZi(){
        System.out.println("子类特有方法");
    }
}
