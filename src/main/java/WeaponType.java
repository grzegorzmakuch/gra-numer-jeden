import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class WeaponType {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String weaponTypeName;

    public WeaponType() {
    }

    public WeaponType(long id, String weaponTypeName) {
        this.id = id;
        this.weaponTypeName = weaponTypeName;
    }
}
