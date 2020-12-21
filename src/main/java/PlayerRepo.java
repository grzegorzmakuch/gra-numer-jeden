import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayerRepo {
    EntityManagerFactory factory = Persistence.createEntityManagerFactory("mssqlUnit");
    EntityManager entityManager = factory.createEntityManager();

    private Scanner sc;
    private List<Player> allPlayers = new ArrayList<>();
    private Player player;

    public void createNewPlayer() {
        System.out.println("Dodawanie nowego gracza");
        player = new Player();
        sc = new Scanner(System.in);
        System.out.println("Podaj imie gracza");
        player.setName(sc.nextLine());
        player.setHealthPoints(10);
        player.setAttack(1);
        player.setDefense(2);
        player.setAlive(true);
        savePlayer(player);
        System.out.println("Gracz o imieniu " + player.getName() + " zostal utworzony");
    }

    private void savePlayer(Player player) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(player);
        transaction.commit();
    }

    public void displayPlayerById() {
        if (checkIfListIsEmpty(allPlayers)) {
            System.out.println("Podaj ID gracza");
            int id = sc.nextInt();
            Player player = allPlayers.get(id);
            System.out.println("Wyswietlanie gracza nr " + id);
            System.out.println(id + " : " + player.getName());
        } else {
            System.out.println("Lista pusta");
        }
    }

    public void displayAllPlayers() {
        if (checkIfListIsEmpty(allPlayers)) {
            System.out.println("Lista wszystkich graczy");
            for (Player player : allPlayers) {
                System.out.println(player.getName());
            }
        } else {
            System.out.println("Lista pusta");
        }
    }

    private boolean checkIfListIsEmpty(List<Player> listToCheck) {
        return listToCheck.size() != 0;
    }
}
