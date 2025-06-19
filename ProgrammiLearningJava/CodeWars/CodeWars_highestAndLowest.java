package ProgrammiLearningJava.CodeWars;

import java.util.*;

public class CodeWars_highestAndLowest {
    public static void main(String[] args) {
        /*
         * https://www.codewars.com/kata/554b4ac871d6813a03000035/train/java
         * In this little assignment you are given a string of space separated numbers,
         * and have to return the highest and lowest number.
         */

        String numbers = ("1 2 -3 4 5");

        System.out.println(highAndLow(numbers));

    }

    public static String highAndLow(String numbers) {

        int[] num = Arrays.stream(numbers.split(" ")) // split per i numeri
                .mapToInt(Integer::parseInt) // converte ogni stringa in int
                .toArray(); // restituisce un array int[]

        int max = num[0];
        int min = num[0];

        for (int i = 0; i < num.length; i++) {

            if (max < num[i]) {

                max = num[i];

            } else if (min > num[i]) {

                min = num[i];

            }
        }

        String maxStr = Integer.toString(max);
        String minStr = Integer.toString(min);

        return maxStr + " " + minStr;
    }
}

/*
 * SOLUZIONE PIÙ PULITA
 * class Kata {
 * static String highAndLow(String numbers) {
 * var stats =
 * stream(numbers.split(" ")).mapToInt(Integer::parseInt).summaryStatistics();
 * return stats.getMax() + " " + stats.getMin();
 * }
 * }
 * 
 * 
 * 
 * public class Kata {
 * public static String highAndLow(String numbers) {
 * String[] array = numbers.split(" ");
 * int min = Integer.MAX_VALUE;
 * int max = Integer.MIN_VALUE;
 * for (int i=0; i< array.length; i++){
 * int value = Integer.parseInt(array[i]);
 * if (value < min) min = value;
 * if (value > max) max = value;
 * }
 * return String.format("%d %d", max, min);
 * }
 * }
 */