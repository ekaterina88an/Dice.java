import java.util.ArrayList;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class Game {
    private static final Logger logger = LogManager.getLogger(Game.class);



    private ArrayList<Player> playersList;
    private Dice dice;
    private ArrayList<Player> winnersList;
    private int bestScore;

    public Game () {
        this.playersList = new ArrayList<>();
        this.winnersList = new ArrayList<>();
        this.dice = new Dice();
        this.bestScore = 0;
    }

    public void addPlayer(String name, int id) {
        logger.info("Running method addPlayer");
        Player player = new Player(id, name, 0);
        playersList.add(player);
    }

    public void setWinner() {
        for (int i=0; i < playersList.size(); i++) {
            if(playersList.get(i).getScore() >= bestScore) {
                bestScore = playersList.get(i).getScore();
            }
        }
        for(int i=0; i < playersList.size(); i++) {
            if(playersList.get(i).getScore() == bestScore) {
                winnersList.add(playersList.get(i));
            }
        }
    }

    public void start(){
        logger.info("Running method start");
        for (int i = 0; i < playersList.size(); i++) {
            int result = dice.roll();
            playersList.get(i).setScore(result);
        }
    }

    public void displayResults() {
        logger.info("Running method displayResults");
        for(int i=0; i < playersList.size(); i++) {
            System.out.println("The player " + playersList.get(i).getName() +
                    " got score " + playersList.get(i).getScore());
        }
    }
    public void displayWinners() {
        logger.info("Running method displayWinners");
        if (winnersList.size() > 1) {
            System.out.println("The best score was " + bestScore + "The winners are:");
            for (int i = 0; i < winnersList.size(); i++) {
                System.out.println(winnersList.get(i).getName());
            }
        } else {
            System.out.println("The winner is " + winnersList.get(0).getName()
                    + " with the score " + bestScore);
        }
    }
}