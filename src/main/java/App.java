import java.util.Scanner;

public class App {

    private static PlayerService playerService;

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
//                case 2:
//                    startGame();
//                    break;
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
        System.out.println("Wybierz:\n1 - Dodaj\n2 - Rozpocznij gre\n3 - Wyswietl wszystkich graczy\n4 - Wyjscie");
    }
}
