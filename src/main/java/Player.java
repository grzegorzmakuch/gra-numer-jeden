import javax.persistence.*;

@Entity
@Table(name = "player")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private int healthPoints;
    private int attack;
    private int defense;
    private boolean isAlive;
    private boolean isActive;
//    one player to many weapons
//    private Weapon weapon;
//    one player to many shields
//    private Shield shield;

    public Player() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
