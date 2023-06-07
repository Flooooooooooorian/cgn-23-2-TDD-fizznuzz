import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MainTest {

    @Test
    void fizzbuzzTest() {
        //Die Methode fizzBuzz, nimmt eine Zahl entgegen und gibt irgendeinen String zurück (nicht null).
        Main main = new Main();

        String actual = main.fizzBuzz(10);

        assertNotNull(actual);
    }
}
