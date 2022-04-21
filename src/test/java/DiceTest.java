import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    @Test
    void TestRollReturnsAValue() {
        Dice dice;

        dice = new Dice();
        for (int i = 0; i < 100; i++) {
            int result = dice.roll();
            assertTrue(result == 1);
            assertTrue(result == 6);
            assertFalse(result == 7);


        }
    }
        @Test
        void TestRollReturnsNotNull() {
            Dice dice1;
            dice1 = new Dice();
            for (int i = 0; i < 100; i++) {
                int result = dice1.roll();
                assertNotNull(result >= 1 && result <= 6);


            }
        }
    }
