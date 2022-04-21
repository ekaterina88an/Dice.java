import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DiceMain {

    private static final Logger logger = LogManager.getLogger(DiceMain.class);
    public static void main(String[] args) {




            Game game = new Game();
            game.addPlayer("Steve", 1);
            game.addPlayer("Katya", 2);
            game.start();
            game.setWinner();
            game.displayResults();
            game.displayWinners();


        }
    }
