import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Weapon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String weaponType;
    private int hitPoints;

    public Weapon() {
    }

    public Weapon(String name, String weaponType, int hitPoints) {
        this.name = name;
        this.weaponType = weaponType;
        this.hitPoints = hitPoints;
    }
}
