package roulette;

public class RouletteNumber {
    public enum RouletteColor{
        RED,
        BLACK,
        GREEN
    }

    private final String number;
    private final RouletteColor color;


    public RouletteNumber(String number, RouletteColor color){
        this.number = number;
        this.color = color;
    }

    public String getNumber(){
        return number;
    }
    public RouletteColor getColor(){
        return color;
    }

    @Override
    public String toString(){
        StringBuffer string = new StringBuffer();
            string.append("number: " + this.getNumber());
            string.append(", ");
            string.append("color: "+this.getColor());
            string.append("\n");

        return string.toString();
    }
}
