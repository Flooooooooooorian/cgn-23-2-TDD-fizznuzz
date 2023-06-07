public class Main {

    //Die Methode fizzBuzz, nimmt eine Zahl entgegen und gibt irgendeinen String zurück (nicht null).

    public String fizzBuzz(int number) {
        if (number % 3 == 0) {
            return "fizz";
        }
        return Integer.toString(number);
    }
}
