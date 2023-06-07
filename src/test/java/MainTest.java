import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MainTest {

    @Test
    void fizzbuzzTest() {
        //Die Methode fizzBuzz, nimmt eine Zahl entgegen und gibt irgendeinen String zurück (nicht null).

        //Für gewöhnliche Zahlen (Beispielinput int 4) soll sie die Zahl als Text (Beispielergebnis String "4") zurückgeben.
        Main main = new Main();

        String actual = main.fizzBuzz(4);

        assertEquals("4", actual);
    }
}
