public class App {
    public static void main(String[] args) {
        Weapon cube = new Weapon("Palka", WeaponType.CLUB, 2);
        Shield smallShield = new Shield("MalaTarcza", ShieldType.SMALL, 1);
        Player player1 = new Player("Mqh", 10, 1, 1, true);
        player1.setWeapon(cube);
        player1.setShield(smallShield);

        System.out.println(player1.getName());

    }
}
