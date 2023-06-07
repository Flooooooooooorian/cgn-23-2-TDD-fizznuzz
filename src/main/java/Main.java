public class Main {

    //Die Methode fizzBuzz, nimmt eine Zahl entgegen und gibt irgendeinen String zurück (nicht null).

    public String fizzBuzz(int number) {
        if (number % 15 == 0) {
            return "fizzbuzz";
        }
        if (number % 3 == 0) {
            return "fizz";
        }
        if (number % 5 == 0) {
            return "buzz";
        }
        return Integer.toString(number);
    }
}
