package me.diegovdw.casino;

import Account.Account;
import Roulette.Roulette;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World!");

        String numbers = "0-32-15-19-4-21-2-25-17-34-6-27-13-36-11-30-8-23-10-5-24-16-33-1-20-14-31-9-22-18-29-7-28-12-35-3-26";
        Account player = new Account("Diego","Van Dewiele", 5000);
        Roulette roulette = new Roulette(numbers);
        roulette.spinRoulette(player,500);

    }
}
