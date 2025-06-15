package ProgrammiLearningJava.CodeWars;

import java.util.*;

public class CodeWars_VowelCount {

    public static void main(String[] args) {

        /*
         * https://www.codewars.com/kata/54ff3102c1bad923760001f3/train/java
         * 
         * 
         * Return the number (count) of vowels in the given string.
         * 
         * We will consider a, e, i, o, u as vowels for this Kata (but not y).
         * 
         * The input string will only consist of lower case letters and/or spaces.
         */
        String str = "Ciao mi chiamo Cesare Giuseppe Foschini";

        System.out.println(getCount(str));

    }

    public static int getCount(String str) {

            char[] stringaArray = str.toCharArray();
            int conteggio = 0;

            for (int i = 0; i < str.length(); i++) {
                char c = stringaArray[i];
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    conteggio++;
                }
            }

            return conteggio;
        }

}
