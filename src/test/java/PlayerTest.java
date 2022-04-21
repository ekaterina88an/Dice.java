import org.junit.jupiter.api.BeforeAll;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    static Player player;
    @BeforeAll
    static void prepareData(){
        player = new Player(1, "Katya", 10);
    }

    @Test
    void testSetPlayerId() {
        player.setId(2);
        assertEquals(2,2,"Id does not match");
    }

    @Test
    void testGetPlayerId() {

        assertEquals(1, player.getId());
    }

    @Test
    void testGetPlayerName() {

        assertEquals("Katya", player.getName());
    }

    @Test
    void testGetPlayerScore() {
        assertEquals(10,10);
    }

    @Test
    void testSetPlayerScore() {
        player.setScore(0);
        assertEquals(0,0);

    }
}