public class Player {
    private String name;
    private int healthPoints;
    private int attack;
    private int defense;
    private boolean isAlive;
    private Weapon weapon;
    private Shield shield;

    public Player(String name, int healthPoints, int attack, int defense, boolean isAlive) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.attack = attack;
        this.defense = defense;
        this.isAlive = isAlive;
    }

    public String getName() {
        return name;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setShield(Shield shield) {
        this.shield = shield;
    }
}
