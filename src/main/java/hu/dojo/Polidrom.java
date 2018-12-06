package hu.dojo;

/*
* Irj olyan programot ami bemeno parameternek megadja hogy hanytol meddig huzzon ki hany szamot
*/
public class Polidrom {

    public static void main(String[] args) {

        Polidrom polidrom =  new Polidrom();
        System.out.println("begin");

        String text1 = "bob";
        String text2 = "nagan";
        String text3 = "alma";
        String text4 = "abba";

        System.out.println(text1 + " is a palindrome: " + polidrom.isPalindrome(text1));
        System.out.println(text2 + " is a palindrome: " + polidrom.isPalindrome(text2));
        System.out.println(text3 + " is a palindrome: " + polidrom.isPalindrome(text3));
        System.out.println(text4 + " is a palindrome: " + polidrom.isPalindrome(text4));

        System.out.println(text1 + " is a palindrome: " + polidrom.isPalindrome2(text1));
        System.out.println(text2 + " is a palindrome: " + polidrom.isPalindrome2(text2));
        System.out.println(text3 + " is a palindrome: " + polidrom.isPalindrome2(text3));
        System.out.println(text4 + " is a palindrome: " + polidrom.isPalindrome2(text4));

        System.out.println("end");
    }


    public boolean isPalindrome(CharSequence input) {
        if (input == null || "".equals(input)) {
            throw new IllegalArgumentException("Input is null or blank!");
        }

        if (new StringBuilder(input).reverse().toString().equals(input)) {
            return true;
        }
        return false;
    }

    public boolean isPalindrome2(CharSequence input) {
        if (input == null || "".equals(input)) {
            throw new IllegalArgumentException("Input is null or blank!");
        }

        for(int i =0; i<input.length()/2 ; i++){
            if(input.charAt(i) != input.charAt(input.length()-i-1)) {
                return false;
            }
        }
        return true;
    }
}
