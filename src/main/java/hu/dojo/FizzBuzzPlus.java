package hu.dojo;

/**
 * Write a program that prints the numbers from 1 to 100, but...
 * <p>
 * numbers that are exact multiples of 3,
 * or that contain 3, must print a string containing "Fizz"
 * For example 9 -> "...Fizz..."
 * For example 31 -> "...Fizz..."
 * <p>
 * numbers that are exact multiples of 5,
 * or that contain 5, must print a string containing "Buzz"
 * For example 10 -> "...Buzz..."
 * For example 51 -> "...Buzz..."
 **/
public class FizzBuzzPlus {


    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZBUZZ = "FizzBuzz";
    public static final String EMPTY = "";

    public static void main(String[] args) {
        FizzBuzzPlus fizzBuzzPlus = new FizzBuzzPlus();
        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzzPlus.testFizzBuzz(i));
        }
        System.out.println("--------------------------------------------");
        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzzPlus.testFizzPlussBuzz2(i));
        }
        System.out.println("--------------------------------------------");
        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzzPlus.testFizzPlussBuzz3(i));
        }
    }

    public static String testFizzBuzz(int number) {
        String retval = EMPTY;
        retval += isFizz(number);
        retval += isBuzz(number);
        if (retval.isEmpty()) {
            return String.valueOf(number);
        }
        return retval;
    }

    public static String isFizz(int number) {
        if (containsCharacter(String.valueOf(number), '3') || number % 3 == 0) {
            return FIZZ;
        }
        return EMPTY;
    }

    public static String isBuzz(int number) {
        if (containsCharacter(String.valueOf(number), '5') || number % 5 == 0) {
            return BUZZ;
        }
        return EMPTY;
    }

    public static boolean containsCharacter(String input, char findedCharacter) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == findedCharacter) {
                return true;
            }
        }
        return false;
    }

    //Megoldas2
    public static String testFizzPlussBuzz2(int number) {
        if ((number % 3 == 0 || containsCharacter(String.valueOf(number), '3'))
                && (number % 5 == 0 || containsCharacter(String.valueOf(number), '5'))) {
            return FIZZBUZZ;
        } else if (number % 3 == 0 || containsCharacter(String.valueOf(number), '3')) {
            return FIZZ;
        } else if (number % 5 == 0 || containsCharacter(String.valueOf(number), '5')) {
            return BUZZ;
        }
        return String.valueOf(number);
    }

    //Megoldas3
    public static String testFizzPlussBuzz3(int number) {
        if ((number % 3 == 0 || containsCharacter(String.valueOf(number), '3'))
                &&(number % 5 == 0 || containsCharacter(String.valueOf(number), '5'))){
            return FIZZBUZZ;
        } else if (number % 3 == 0 || containsCharacter(String.valueOf(number), '3')) {
            return FIZZ;
        } else if (number % 5 == 0 || containsCharacter(String.valueOf(number), '5')) {
            return BUZZ;
        }
        return String.valueOf(number);
    }

    public static boolean containsCharacter3(String input, char findedCharacter) {
        if (input.indexOf(findedCharacter) == -1) {
            return false;
        }
        return true;
    }

}
