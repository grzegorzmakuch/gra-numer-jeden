import java.util.Scanner;

public class App {

    private static PlayerService playerService;
    private static GameService gameService;

    public static void main(String[] args) {
        playerService = new PlayerService();

        mainLoop();
    }

    private static void mainLoop() {
        int option = -1; //wyniesc do private
        boolean endGame = false; //wyniesc do private
        while(!endGame) {
            printMainOptions();
            option = playersChoice();
            switch (option) {
                case 1:
                    playerService.createNewPlayer();
                    break;
                case 2:
                    playerService.displayAllPlayers();
                    break;
                case 3:
                    playerService.displayPlayerById();
                    break;
                case 4:
                    System.out.println("Wyjscie");
                    endGame = true;
                    break;
                default:
                    System.out.println("Niepoprawna wartosc");
                    break;
            }
        }
    }

    private static int playersChoice() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static void printMainOptions() {
        System.out.println("Wybierz:\n1 - Dodaj\n2 - Pokaz wszystkich\n3 - Wyswietl gracza po ID\n4 - Wyjscie");
    }
}
