import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        PlayerRepo playerRepo = new PlayerRepo();
        Scanner sc = new Scanner(System.in);
        int option;
        boolean endGame = false;

        while (!endGame) {
            System.out.println("Wybierz:\n1 - Dodaj\n2 - Pokaz po id\n3 - Wyswietl wszystkich graczy\n0 - Wyjscie");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    playerRepo.createNewPlayer();
                    break;
                case 2:
                    playerRepo.displayPlayerById();
                    break;
                case 3:
                    playerRepo.displayAllPlayers();
                    break;
                case 0:
                    System.out.println("Wyjscie");
                    endGame = true;
                    break;
                default:
                    System.out.println("Bledna instrukcja");
                    break;
            }
        }
    }
}
