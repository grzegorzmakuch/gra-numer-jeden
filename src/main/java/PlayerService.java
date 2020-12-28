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
        List<Player> allPlayers = playerRepo.getAllPlayers();
        for (Player player : allPlayers) {
            System.out.println(player.getName());
        }
    }

    public List<Player> getAllPlayers() {
        List<Player> result = new ArrayList<>();
        for (Player player : playerRepo.getAllPlayers()) {
            result.add(player);
        }
        return result;
    }
}
