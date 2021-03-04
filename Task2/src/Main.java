/*
I denne opgave vil du få brug for at læse filen ind igen, så du kan splitte på .(punktum) istedet for " " (mellemrum)

1.a Kopier linie 12 til 19 ind i metoden (eller de linier der henter filen ind, scanner og splitter den i et while loop).
1.b På linien hvor der laves et split array, skal du ændre så du istedet bruger denne kommando til at splitte:   String[] splitarray = scan.nextLine().split("\\. ");
1.c Hold styr på mens du løber gennem teksten om sætningen er længere end den sætning der pt. er længst.
1.d Kald metoden fra main
* */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    private static String [][] text = new String[12][1];

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("data.txt");
        Scanner scan = new Scanner(file);

        String placeholder = "";
        while(scan.hasNextLine()){
            String [] sent = scan.nextLine().split("\\. ");
            for (int j = 0; j < sent.length; j++) {
                if(sent[j].length() > placeholder.length()){
                    placeholder = sent[j];
                }
            }
        }
        System.out.println(placeholder);
    }

}
