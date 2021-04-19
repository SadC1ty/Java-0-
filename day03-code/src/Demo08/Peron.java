package Demo08;

public class Peron {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Peron(String name) {
        this.name = name;
    }

    public Peron() {
    }

    public void run(){
        for (int i = 0; i < 20; i++) {
            System.out.println(name+i);
        }
    }
}
