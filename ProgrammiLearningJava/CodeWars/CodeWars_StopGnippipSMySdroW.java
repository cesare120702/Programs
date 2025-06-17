package ProgrammiLearningJava.CodeWars;

public class CodeWars_StopGnippipSMySdroW {
    public static void main(String[] args) {

        /*
         * https://www.codewars.com/kata/5264d2b162488dc400000001/train/java
         * 
         * Write a function that takes in a string of one or more words,
         * and returns the same string, but with all words that have five or more
         * letters reversed (Just like the name of this Kata).
         * Strings passed in will consist of only letters and spaces. Spaces will be
         * included only when more than one word is present.
         */

        String sentence = "Hey fellow warriors";
        System.out.println(spinWords(sentence));

    }

    public static String spinWords(String sentence) {

        String[] divisione = sentence.split(" "); // abbiamo diviso la frase rendendo un array di parole
        String risultato = "";
        int lunghezzaParola = 0;

        for (int i = 0; i < divisione.length; i++) {

            lunghezzaParola = divisione[i].length();

            if (lunghezzaParola > 4) {
                StringBuilder tmp = new StringBuilder(divisione[i]);
                tmp.reverse();
                divisione[i] = tmp.toString();
            }

        }

        risultato = String.join(" ", divisione); // lo usiamo per riassemblare la nostra frase

        return risultato;
    }

}

/*
 * SOLUZIONE PIÙ PULITA
 * import java.util.Arrays;
 * 
 * public class SpinWords {
 * 
 * public String spinWords(String sentence) {
 * String[] words = sentence.split(" ");
 * for (int i=0; i<words.length; i++) {
 * if (words[i].length() >= 5) {
 * words[i] = new StringBuilder(words[i]).reverse().toString();
 * }
 * }
 * return String.join(" ",words);
 * }
 * }
 */
