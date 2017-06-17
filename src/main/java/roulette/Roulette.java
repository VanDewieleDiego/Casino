package roulette;

import account.Account;

import java.util.*;

public class Roulette {

    private RouletteWheel wheel;
    private BettingPool bettingPool;

    public Roulette(String whichWheel){
        System.out.println("Class: roulette");

        this.wheel = new RouletteWheel(whichWheel);
        this.bettingPool = new BettingPool();
    }

    public RouletteWheel getWheel(){
        return wheel;
    }

    public BettingPool getBettingPool(){
        return bettingPool;
    }

    public void betSingleNumber(Account player, int number, int amount){
        RouletteNumber nr = wheel.getNumber(Integer.toString(number));
        System.out.println(nr);
        Bet bet = new Bet(player,nr,amount);
        System.out.println(bet);
        bettingPool.addBet(bet);
    }
    public void betColor(Account player, String color, int amount){
        RouletteNumber.RouletteColor cl = RouletteNumber.RouletteColor.valueOf(color.toUpperCase());
        Bet bet = new Bet(player, cl,amount);
        System.out.println(bet);
        bettingPool.addBet(bet);
    }
    private int randInt(int min, int max){
        Random rnd = new Random();
        return rnd.nextInt((max-min)+1)+min;
    }

    public void spinRoulette(){
//        long startTime = System.currentTimeMillis();
        RouletteNumber number;
//        do {

            int random = randInt(0,wheel.getLength());
            number = wheel.getNumber(Integer.toString(random));

//        }while (System.currentTimeMillis()-startTime < 3000);

        System.out.println("Rolled number: "+number);

        //rigged
        number = new RouletteNumber("0", RouletteNumber.RouletteColor.GREEN);

        checkWinners(number);
    }

    private void checkWinners(RouletteNumber number) {
        if (bettingPool.getLength() == 0){
            System.out.println("geen bets geplaatst");
            return;
        }
        ArrayList<Bet> poollist = bettingPool.getPool();
        for ( Bet bet: poollist) {
//            System.out.println(bet.getNumber());
//            System.out.println(number);
            if ((bet.getNumber().getNumber() == null && bet.getNumber().getColor().equals(number.getColor())) || bet.getNumber().getNumber().equals(number.getNumber()) ){
//                System.out.println("gevonden boooi!");
                int payout = bet.getAmount() + (bet.getAmount()*checkPayout(bet.getWhichBet()));
                bet.getPlayer().addWin(payout);
            }
        }
    }
    private int checkPayout(String whichBet){
        int payout;

        switch (whichBet){
            case "number":
                payout = 35;
                break;
            case "color":
                payout = 1;
                break;
            default:
                payout = 1;
                break;
        }

        return payout;
    }

}
