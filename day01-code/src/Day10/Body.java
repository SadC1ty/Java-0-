package Day10;

public class Body { //外部类
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void method(){
        System.out.println("外部类方法");
        Heart heart = new Heart();
        heart.Beat();
    }

    public class Heart{
        public void Beat(){
            System.out.println("name:"+name);
            System.out.println("内部类方法");
        }
    }
}
