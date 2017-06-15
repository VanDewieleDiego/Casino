package roulette;

public class RouletteNumber {
    public enum RouletteColor{
        RED,
        WHITE,
        GREEN
    }

    private final int number;
    private final RouletteColor color;


    public RouletteNumber(int number, RouletteColor color){
        this.number = number;
        this.color = color;
    }

    public int getNumber(){
        return number;
    }
    public RouletteColor getColor(){
        return color;
    }

}
