package bites.examples;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println("For loop:");
        for(Integer counter = 1; counter <= 100; counter++) {
            FizzBuzz.play(counter);
        }

        System.out.println("While loop:");
        Integer counter = 1;
        while (counter <= 100) {
            FizzBuzz.play(counter);
            counter++;
        }
        /*
        FizzBuzz.play(1);
        FizzBuzz.play(3);
        FizzBuzz.play(5);
        FizzBuzz.play(15);
         */
    }

    public static void play(Integer number) {
        if (number % 15 == 0) {
            System.out.println("FizzBuzz");
        } else if (number % 3 == 0) {
            System.out.println("Fizz");
        } else if (number % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(number);
        }
    }
}
