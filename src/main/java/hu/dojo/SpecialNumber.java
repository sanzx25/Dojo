package hu.dojo;

/*
*   irj olyan programot ami osszeadja a megadott szam szamjegyeit addig mig egy szamjegyu nem lesz az eredmeny es azt visszaadja
*/
public class SpecialNumber {

    static int retval = 0;

    public static void main(String[] args) {

        System.out.println("begin");
        System.out.println(SpecialNumber.specialSum(123456789));
        System.out.println(SpecialNumber.specialSum2(123456789));
        System.out.println(SpecialNumber.specialSum3(123456789));
        System.out.println(SpecialNumber.specialSum(1));
        System.out.println(SpecialNumber.specialSum2(1));
        System.out.println(SpecialNumber.specialSum3(1));
        System.out.println(SpecialNumber.specialSum(11));
        System.out.println(SpecialNumber.specialSum2(11));
        System.out.println(SpecialNumber.specialSum3(11));
        System.out.println(SpecialNumber.specialSum(111));
        System.out.println(SpecialNumber.specialSum2(111));
        System.out.println(SpecialNumber.specialSum3(111));
        System.out.println(SpecialNumber.specialSum(92));
        System.out.println(SpecialNumber.specialSum2(92));
        System.out.println(SpecialNumber.specialSum3(92));
        System.out.println(SpecialNumber.specialSum(901));
        System.out.println(SpecialNumber.specialSum2(901));
        System.out.println(SpecialNumber.specialSum3(901));
        System.out.println("end");
    }


    public static int specialSum(int num) {
        if (num < 10 && num > -10) {
            return num;
        }

        int sum = 0;
        char[] numberAsCharArray = String.valueOf(num).toCharArray();
        for (char character : numberAsCharArray) {
            sum += Character.digit(character, 10);
        }
        return sum = SpecialNumber.specialSum(sum);
    }


    public static int specialSum2(int num) {
        if (num < 10 && num > -10) {
            return num;
        }
        int result = 0;
        char[] array = String.valueOf(num).toCharArray();
        while (array.length != 1) {
            result = 0;
            for (char c : array) {
                result += Character.digit(c, 10);
            }
            array = String.valueOf(result).toCharArray();
        }
        return result;
    }

    public static int specialSum3(int num) {
        retval = 0;
        while (0 < num) {
            retval = retval + num % 10;
            num = num / 10;
        }
        if (retval > 9) {
            specialSum3(retval);
        }
        return retval;
    }
}

