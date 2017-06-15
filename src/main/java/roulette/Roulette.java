package roulette;

import account.Account;

import java.util.*;

public class Roulette {

    private ArrayList<RouletteNumber> wheelnumbers;
    //private ArrayList<String> numbercolors;

    public Roulette(String whichWheel){
        System.out.println("Class: roulette");

        this.wheelnumbers = makeWheelNumberList(whichWheelToTake(whichWheel));
        wheelnumbers.toString();
    }
    private String whichWheelToTake(String wheel){
        if (wheel.equals("doubleZero")){
            return "0-28-9-26-30-11-7-20-32-17-5-22-34-15-3-24-36-13-1-00-27-10-25-29-12-8-19-31-18-6-21-33-16-4-23-35-14-2";
        }

        return "0-32-15-19-4-21-2-25-17-34-6-27-13-36-11-30-8-23-10-5-24-16-33-1-20-14-31-9-22-18-29-7-28-12-35-3-26";
    }

    private ArrayList makeWheelNumberList(String list){

        String[] listInArray = list.split("-");

        ArrayList<RouletteNumber> numbers = new ArrayList();
        int teller = 0;
        for (String number: listInArray) {
            teller++;
            if (number.equals("0") || number.equals("00")){
                numbers.add(new RouletteNumber(Integer.parseInt(number), RouletteNumber.RouletteColor.GREEN));
            }else if (teller%2 == 1){
                numbers.add(new RouletteNumber(Integer.parseInt(number), RouletteNumber.RouletteColor.WHITE));
            }else {
                numbers.add(new RouletteNumber(Integer.parseInt(number), RouletteNumber.RouletteColor.RED));
            }
        }
        return numbers;
    }
    public void spinRoulette(Account player, int bet){
        System.out.println(player.getName()+ ": " + player.getBalance());
        player.bet(bet);
        System.out.println(player.getName()+ ": " + player.getBalance());
        //return "spin done";
    }

    @Override
    public String toString(){
        StringBuffer string = new StringBuffer();
        for (RouletteNumber number: this.wheelnumbers) {
            string.append("number: " + number.getNumber());
            string.append(", ");
            string.append("color: "+number.getColor());
            string.append("\n");
        }
        return string.toString();
    }
}
