import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Player
{
    private static final Logger logger = LogManager.getLogger(Player.class);


    private int id;
    private String name;
    private int score;



    public Player(int id, String name, int score){
        this.id = id;
        this.name = name;
        this.score = 0;



    }
    public void setId(int id) {
        if (id < 2){

            logger.error("Something bad happened");
            throw new IllegalArgumentException("The number of player must be no less than 2");
        }
        this.id = id;
    }


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }



}



