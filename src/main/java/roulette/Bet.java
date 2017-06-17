package roulette;

import account.Account;

public class Bet {

    private  Account player;
    private RouletteNumber number;
    private RouletteNumber.RouletteColor color;
    private String whichBet;
    private int amount;

    public Bet(Account player, RouletteNumber number, int amount){
        this.player = player;
        this.number = number;
        this.amount = amount;
        this.whichBet = "number";
        player.bet(amount);
    }

    public Bet(Account player, RouletteNumber.RouletteColor color, int amount){
        this.player = player;
        this.number = new RouletteNumber(null,color);
        this.amount = amount;
        this.whichBet = "color";
        player.bet(amount);
    }

    public Account getPlayer(){
        return player;
    }
    public RouletteNumber getNumber(){
        return number;
    }
    public int getAmount(){
        return amount;
    }
    public String getWhichBet(){
        return whichBet;
    }

    @Override
    public String toString(){
        StringBuffer string = new StringBuffer();
        string.append("You (" + this.getPlayer().getName() + ")");
        string.append(" ");
        string.append("have bet "+this.getAmount());
        string.append(" ");
        string.append("on number "+this.getNumber().getNumber());
        string.append("\n");

        return string.toString();
    }
}
