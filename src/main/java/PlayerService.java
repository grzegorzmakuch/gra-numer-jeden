import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlayerService {

    private Scanner sc;
    private List<Player> allPlayers = new ArrayList<>();
    private Player player;

    private PlayerRepo playerRepo = new PlayerRepo();

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
        player.setActive(false);
        playerRepo.savePlayer(player);
        System.out.println("Gracz o imieniu " + player.getName() + " zostal utworzony");
    }

    public void displayPlayerById() {
        System.out.println("Podaj ID gracza");
        sc = new Scanner(System.in);
        int id = sc.nextInt();
        Player result = playerRepo.getPlayerById(id);
        System.out.println(result.getName());
    }

    public void displayAllPlayers() {
        System.out.println("Podaj id gracza:");
        int option = sc.nextInt();
        Player pl = playerRepo.getPlayerById(option);
        System.out.println(pl.getName());
    }

    public void addPointsToPlayer() {

    }

//    public Player choosePlayerFromAvalaiblePlayers() {
//        Player activePlayer;
//        System.out.println("Wybierz gracza z listy");
//        return activePlayer;
//    }
}
