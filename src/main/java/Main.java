import account.Account;
import roulette.Roulette;
import roulette.RouletteWheel;

public class Main {
    public static void main(String[] args) {

        System.out.println("Main");

        //account + show balance
        Account player = new Account("Diego","Van Dewiele", 5000);
        System.out.println(player.getName()+ ": " + player.getBalance());

        Roulette roulette = new Roulette("doubleZero");

        //roulette.spinRoulette(player,500);

        //bet single number for player
//        roulette.betSingleNumber(player,10,50);
        roulette.betSingleNumber(player,0,500);
        roulette.betColor(player,"green",500);
        System.out.println(roulette.getBettingPool());
        roulette.spinRoulette();



    }
}
