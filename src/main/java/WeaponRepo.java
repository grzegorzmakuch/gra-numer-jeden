import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class WeaponRepo {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("mssqlUnit");
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    public void createNewWeapon(String name, String weaponType, int hitPoints) {
        Weapon newWeapon = new Weapon(name, weaponType, hitPoints);
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        entityManager.persist(newWeapon);
        entityTransaction.commit();
    }
}
