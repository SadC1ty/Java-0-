package Day10;

public class DemoMain {
    public static void main(String[] args) {
        Hero hero =new Hero();
        hero.setName("SadC1ty");
        hero.setAge(20);

        //
        Weapon weapon = new Weapon("铁剑");
        hero.setWeapon(weapon);

        hero.attack();//SadC1ty用铁剑攻击
    }
}
