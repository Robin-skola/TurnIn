import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LogicThingsTest {

    @Test
    void testLineAndCharacterCount() {
        LogicThings logic = new LogicThings();

        logic.processBreak("Hej");
        logic.processBreak("Hur mår du?");
        logic.processBreak("test test test");

        assertEquals(3, logic.getHowManyLines(), "Ska vara 3 rader");
        assertEquals(28, logic.getHowManyCharacters(), "Ska vara 28  tecken");
    }

    @Test
    void testWordCountAndLongestWord() {
        LogicThings logic = new LogicThings();

        logic.processBreak("Roligt roligt");
        logic.processBreak("hej hej hej hej  hej hej");

        assertEquals(8, logic.getHowManyWords(), "Ska vara 8 ord");
        assertEquals("gött", logic.getLongestWord(), "Längsta ordet ska vara fun");
    }

    @Test
    void testStopCondition() {
        LogicThings logic = new LogicThings();

        boolean shouldStop = logic.processBreak("stop");

        assertTrue(shouldStop, "ska stoppas när stop skrivits");
        assertEquals(0, logic.getHowManyLines(), "ska vara 0 rador");
        assertEquals(0, logic.getHowManyCharacters(), "ska vara 0 tecken");
    }
}

