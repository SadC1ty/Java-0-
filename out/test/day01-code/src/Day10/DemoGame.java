package Day10;

public class DemoGame {
    public static void main(String[] args) {
        MyHero hero = new MyHero();
        hero.setName("SadC1ty");
        hero.setSkill(new MySkill());
        hero.attack();//SadC1ty使用横扫千军
        System.out.println("=========");

        //使用匿名内部类
        MyHero hero1 = new MyHero();
        hero1.setName("Jackd0w");
        Skill skill = new Skill() {
            @Override
            public void use() {
                System.out.println("长虹贯日");
            }
        };
        hero1.setSkill(skill);
        hero1.attack();//Jackd0w使用长虹贯日
        System.out.println("=========");
    }
}
