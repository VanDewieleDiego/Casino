package roulette;

import java.util.ArrayList;

public class BettingPool {

    private ArrayList<Bet> bets;

    public BettingPool(){
        this.bets = new ArrayList<Bet>();
    }

    public void addBet(Bet bet){
        bets.add(bet);
    }

    public int getLength(){
        return bets.size();
    }

    public ArrayList getPool(){
        return bets;
    }

    public void deleteBet(Bet bet){
        bets.remove(bet);
    }

    public void emptyPool(){
        bets.clear();
    }

    @Override
    public String toString(){
        StringBuffer string = new StringBuffer();
        for (Bet bet: this.bets) {
            string.append("player: " + bet.getPlayer().getName());
            string.append(", ");
            string.append("number: " + bet.getNumber().getNumber());
            string.append(", ");
            string.append("amount: " + bet.getAmount());
            string.append("\n");
        }
        return string.toString();
    }
}
