import account.Account;
import roulette.Roulette;

public class Main {
    public static void main(String[] args) {

        System.out.println("Main");

        //account + show balance
        Account player = new Account("Diego","Van Dewiele", 5000);
        System.out.println(player.getName()+ ": " + player.getBalance());
        // 2 verschillende roulettes
        Roulette roulette = new Roulette("doubleZero");
        Roulette roulette2 = new Roulette("single");
        System.out.println(roulette.getWheel());
        System.out.println(roulette2.getWheel());

        //roulette.spinRoulette(player,500);

        //bet single number for player
        roulette.betSingleNumber(player,10,50);

    }
}
