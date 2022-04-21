import java.util.Random;

public class Dice {
    private int numOfSides;


    public Dice() {
        this.numOfSides = 6;

    }

    public int roll() {
        Random rand = new Random();
        int result = rand.nextInt(numOfSides) + 1;
        return result;

    }
}

