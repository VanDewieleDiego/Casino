package roulette;

import account.Account;

import java.util.*;

public class Roulette {

    private RouletteWheel wheel;

    public Roulette(String whichWheel){
        System.out.println("Class: roulette");

        this.wheel = new RouletteWheel(whichWheel);
        //wheel.toString();
    }

    public RouletteWheel getWheel(){
        return wheel;
    }
    public void betSingleNumber(Account player, int number, int bet){
        RouletteNumber nr = wheel.getNumber(number);
        System.out.println(nr);

        System.out.println(player.getName()+ ": " + player.getBalance());
        player.bet(bet);
        System.out.println(player.getName()+ ": " + player.getBalance());
    }

    public void spinRoulette(Account player, int bet){
        System.out.println(player.getName()+ ": " + player.getBalance());
        player.bet(bet);
        System.out.println(player.getName()+ ": " + player.getBalance());
        //return "spin done";
    }


}
