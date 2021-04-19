package Day10;

public class MyHero {
    private String name;
    private Skill skill;

    public MyHero(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public MyHero() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
    public void attack(){
        System.out.print(name+"使用");
        skill.use();
    }
}
