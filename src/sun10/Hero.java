package sun10;

public class Hero {
    private String heroname;
    private int age;
    private Weapon weapon;

    public String Show(){
        return "wo de ming zi " + heroname + " " + age + " " +weapon.getWeaponname();
    }
    public Hero(){

    }
    public Hero(String heroname, int age, Weapon weapon) {
        this.heroname = heroname;
        this.age = age;
        this.weapon = weapon;
    }

    public String getHeroname() {
        return heroname;
    }

    public void setHeroname(String heroname) {
        this.heroname = heroname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
