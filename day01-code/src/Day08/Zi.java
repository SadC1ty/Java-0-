package Day08;

public class Zi extends Fu {

    public Zi(){
        //super();  调用父类的无参构造
        super(20);  //调用父类的有参构造
        System.out.println("调用子类的无参构造");
    }

    @Override
    public Object method(){
        return null;
    }
}
