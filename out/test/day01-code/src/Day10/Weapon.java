package Day10;

public class Weapon {
    private String code;

    public String getName() {
        return code;
    }

    public void setName(String name) {
        this.code = name;
    }

    public Weapon(String name) {
        this.code = name;
    }

    public Weapon() {
    }
}
