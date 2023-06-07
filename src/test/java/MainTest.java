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


    @Test
    void fizzBuzzTest_isDividableBy3(){
        //Ist die Zahl durch 3 teilbar, gib fizz zurück.

        //GIVEN
        int number = 3;
        Main main = new Main();

        //WHEN
        String actual = main.fizzBuzz(number);

        //THEN
        String expected = "fizz";
        assertEquals(expected, actual);
    }

    @Test
    void fizzBuzzTest_isDividableBy5() {
        //Ist die Zahl durch 5 teilbar, gib buzz zurück.

        //GIVEN
        int number = 5;
        Main main = new Main();

        //WHEN
        String actual = main.fizzBuzz(number);

        //THEN
        String expected = "buzz";
        assertEquals(expected, actual);
    }

}
