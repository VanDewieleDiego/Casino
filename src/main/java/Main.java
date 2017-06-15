import account.Account;
import roulette.Roulette;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World!");


        Account player = new Account("Diego","Van Dewiele", 5000);
        Roulette roulette = new Roulette("doubleZero");
        roulette.spinRoulette(player,500);
        System.out.println(roulette.toString());

    }
}
