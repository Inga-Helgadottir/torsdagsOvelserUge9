/*
    Til denne opgave skal du fortsætte i StringWorks projektet, hvor vi har loadet noget tekst fra wikipedia ind og lagt linierne i et dobbelt array (text[][])
    Du skal derfor følge samme fremgangsmåde med forloops, som vi anvendte da vi løste de første par opgaver i projektet.
    Denne opgave kan givetvis løses med regular expression, men det er ikke formålet, så prøv at løse den 'manuelt.

1.a Lav en ny metode printWordsWithDoubleConsonant()
1.b Metoden skal gennemløb hver linie og hvert ord i hver linie
1.c Tjek om den enkelte karakter i hvert ord er identisk med forrige karakter.
    Hint: Det kan være en god ide FØRST at tjekke bogstavet er en konsonant.
    Det anbefales her at du skriver en separat metode, der alene tager sig af dét.
    Denne metode skal både sikre at karakteren hverken er en vokal eller et tal (hint: Character.isDigit(c))
1.d Kald metoden fra main.
* */


import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    private static String [][] text = new String[12][1];
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("data.txt");//File file = new File("src/data.txt");//if the data file is in src
        Scanner scan = new Scanner(file);

        int i = 0;

        while(scan.hasNextLine()){
            text[i] = scan.nextLine().split(" ");
            i++;
        }

        printWordsWithDoubleConsonant(text);
    }

    private static void printWordsWithDoubleConsonant(String[][] text){
        for(int i = 0; i < text.length; i++){
            for (String s : text[i]) {
                char[] chars = s.toCharArray();
                for (int j = 0; j < chars.length; j++) {
                    if(check(chars[j], s) && j != 0){
                        if(chars[j] == chars[j-1]){
                            System.out.println(s);
                        }
                    }
                }
            }
        }
    }

    private static boolean check(char c, String s){
        if(c == 'a' || c == 'e' || c == 'o' || c == 'u' || c == 'y' || c == 'æ' || c == 'ø' || c == 'A' || c == 'E' || c == 'O' || c == 'U' || c == 'Y' || c == 'Æ' || c == 'Ø'){
            return false;
        }else if(Character.isDigit(c)){
            return false;
        }
        return true;
    }

}
