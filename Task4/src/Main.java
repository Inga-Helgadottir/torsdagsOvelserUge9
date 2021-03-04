/*
 1.a Skriv en metode printIfPalindrome() som tager en tekststreng som argument og
    printer den HVIS den kan skrives bagfra uden at ændre sig.
    (Hint: Lad dig inspirere i dokumentationen for String klassen)

 1.b Sørg for at metoden ikke er case-sensitiv.

 1.c Kald metoden fra main med argumentet "Den laks skal ned", for at teste den.
 */

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        printIfPalindrome("Anna");//true
        printIfPalindrome("inga");//false
    }

    public static void printIfPalindrome(String text){
        String reverseText = new StringBuilder(text).reverse().toString();
        String reverseTextLowerCase = reverseText.toLowerCase();
        String textLowerCase = text.toLowerCase();
        if(textLowerCase.equals(reverseTextLowerCase)){
            System.out.println(text);
        }
    }
}
