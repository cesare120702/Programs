package ProgrammiLearningJava.CodeWars;

import java.util.*;

public class CodeWars_ShortestWord {

    public static void main(String[] args) {
        /*
         * https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9/train/java
         * Simple, given a string of words, return the length of the shortest word(s).
         * 
         * String will never be empty and you do not need to account for different data
         * types.
         */

        String s = "bitcoin take over the world maybe who knows perhaps";
        System.out.println(findShort(s));
    }

    public static int findShort(String s) {

        String[] divisione = s.split(" ");
        System.out.println(Arrays.toString(divisione));
        String corta = divisione[0];
        System.out.println(corta);

        for (int i = 0; i < divisione.length; i++) {
            if (divisione[i].length() < corta.length()) {
                corta = divisione[i];
                System.out.println(corta);

            }
        }

        return corta.length();
    }
}
