package hu.dojo;

/**
 * Keszits olyan programot ami 1 tol 100 ig kiirja a szamokat, de mindne 3-mal oszhato szam helyett azt irja ki hogy Fizz
 * es minden 5 -tel oszthato helyett azt irja ki hogy Buzz. Ami 3-mal is es 5-tel is oszthato
 * ahelyett azt irja ki hogy FizzBuzz
 */
public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZBUZZ = "FizzBuzz";
    public static final String EMPTY = "";

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzz.testFizzBuzz(i));
        }
        System.out.println("--------------------------------------------");
        for (int i = 1; i <= 100; i++) {
            System.out.println(fizzBuzz.testFizzBuzz2(i));
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
        if (number % 3 == 0) {
            return FIZZ;
        }
        return EMPTY;
    }

    public static String isBuzz(int number) {
        if (number % 5 == 0) {
            return BUZZ;
        }
        return EMPTY;
    }

    //Megoldas2
    public static String testFizzBuzz2(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return FIZZBUZZ;
        } else if (number % 3 == 0) {
            return FIZZ;
        } else if (number % 5 == 0) {
            return BUZZ;
        }
        return String.valueOf(number);
    }

}
