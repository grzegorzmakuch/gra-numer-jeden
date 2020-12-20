public class Weapon {
    private String name;
    private WeaponType weaponType;
    private int hitPoints;

    public Weapon(String name, WeaponType weaponType, int hitPoints) {
        this.name = name;
        this.weaponType = weaponType;
        this.hitPoints = hitPoints;
    }
}
