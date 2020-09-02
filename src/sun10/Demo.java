package sun10;

public class Demo {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setHeroname("gai");
        hero.setAge(20);
        Weapon weapon = new Weapon("AK-47");
        hero.setWeapon(weapon);

        System.out.println(hero.Show());
    }
}
