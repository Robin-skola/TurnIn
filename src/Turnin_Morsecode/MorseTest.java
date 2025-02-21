
package Turnin_Morsecode;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MorseTest {

    private MorseLogic morseLogic;

    @BeforeEach
    public void setUp() {
        morseLogic = new MorseLogic();
    }

    @Test
    public void textToMorse_Letter() {
        assertEquals(".-", morseLogic.textToMorse("A"), "A ska bli .-.");
    }

    @Test
    public void testTextToMorse_Word() {
        assertEquals(".... . .-.. .-.. ---", morseLogic.textToMorse("HELLO"), "HELLO ska bli .... . .-.. .-.. --- i Morse.");
    }

    @Test
    public void testMorseToText_Letter() {
        assertEquals("E", morseLogic.morseToText("."), " . ska bli E.");
    }

    @Test
    public void testMorseToText_Word() {
        assertEquals("HELLO", morseLogic.morseToText(".... . .-.. .-.. ---"), ".... . .-.. .-.. --- ska bli 'HELLO'.");
    }

    @Test
    public void testMorseToTest_Exception() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            morseLogic.morseToText("...---...");
        });

        assertEquals("Fel: Ogiltig Morse-kod '...---...'.", exception.getMessage());
    }
}