/*
I denne opgave skal du brug substring metoden, og du skal fange StringIndexOutOfBounds exeption som Java vil smide
i tilfælde hvor metoden bliver kaldt med for høje tal.

 1.a Lav en metode, printPartOfWord(), med tre parametre:
    1. parameter er ordet,
    2. parameter er index for det bogstav delmængden starter med og
    3. parameter er længden på delmængden
 Ex: argumenterne "Købehavn", 1 og 4  skal give outputtet "øben".

 1.b Sørg for at metoden kan håndtere at blive kaldt med tal-argumenter som er for høje.
    Brug en try catch hvor du håndterer undtagelsen StringIndexOutOfBounds.

 1.c: I catch blokken skal du tjekke om argument 2 er lavere end ordets længe.
     Hvis det er tilfældet, skal delmængden starte ved argument 2 og til og med sidste bogstav.
     Hvis argument 2 er højere end ordets længde skal du give en passende fejlmeddelelse
 Ex:  Købehavn, 6, 4  skal . give outputtet 'avn'

 */
import java.lang.StringIndexOutOfBoundsException;
public class Main {

    public static void main(String[] args) {
        printPartOfWord("København", 6, 4, 1);
        printPartOfWord("København", 1, 4, 2);
        printPartOfWord("København", -1, 4, 3);
    }

    public static void printPartOfWord(String word, int start, int end, int functionCall){
        String subString = "";
        try{
            subString = word.substring(start, start+end);
        }catch(StringIndexOutOfBoundsException e){
            if(start > word.length() || start < 0){
                System.out.println("IndexOutOfBounds in function call " + functionCall);
            }else if(start + end > word.length()){
                subString = word.substring(start);
            }
        }
        System.out.println(subString);
    }
}
