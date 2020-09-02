package sun10;

public class Weapon {
    private String weaponname;
    public Weapon(){

    }
    public Weapon(String weaponname) {
        this.weaponname = weaponname;
    }

    public String getWeaponname() {
        return weaponname;
    }

    public void setWeaponname(String weaponname) {
        this.weaponname = weaponname;
    }
}
