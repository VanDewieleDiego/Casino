package Roulette;

import Account.Account;

import java.util.*;

public class Roulette {

    private ArrayList<Integer> wheelnumbers;

    public Roulette(String wheel){
        System.out.println("Class: Roulette");

        //0-32-15-19-4-21-2-25-17-34-6-27-13-36-11-30-8-23-10-5-24-16-33-1-20-14-31-9-22-18-29-7-28-12-35-3-26

        this.wheelnumbers = makeWheelNumberList(wheel);
        System.out.println(wheelnumbers);
    }

    private ArrayList makeWheelNumberList(String list){

        String[] listInArray = list.split("-");

        ArrayList<Integer> numbers = new ArrayList<>();
        for (String number: listInArray) {
            numbers.add(Integer.parseInt(number));
        }
        return numbers;
    }
    public void spinRoulette(Account player, int bet){
        System.out.println(player.getName()+ ": " + player.getBalance());
        player.withdrawBalance(bet);
        System.out.println(player.getName()+ ": " + player.getBalance());
        //return "spin done";
    }
}
