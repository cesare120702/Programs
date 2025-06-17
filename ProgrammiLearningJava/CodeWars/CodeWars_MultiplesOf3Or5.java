package ProgrammiLearningJava.CodeWars;

public class CodeWars_MultiplesOf3Or5 {

    public static void main(String[] args) {

        /*
         * https://www.codewars.com/kata/514b92a657cdc65150000006/train/java
         * 
         * If we list all the natural numbers below 10 that are multiples of 3 or 5, we
         * get 3, 5, 6 and 9. The sum of these multiples is 23.
         * 
         * Finish the solution so that it returns the sum of all the multiples of 3 or 5
         * below the number passed in.
         * 
         * Note: If the number is a multiple of both 3 and 5, only count it once.
         * 
         * Courtesy of projecteuler.net (Problem 1)
         */

        int number = 10;

        System.out.println(Solution(number));

    }

    public static int Solution(int number) {

        int sommaNumeri = 0;
        for (int i = 0; i < number; i++) {

            if (i % 3 == 0) {

                sommaNumeri = sommaNumeri + i;
                System.out.println(i + "primo");
            } else if (i % 5 == 0) {

                sommaNumeri = sommaNumeri + i;
                System.out.println(i + "secondo");
            } else if (i % 3 == 0 && i % 5 == 0) {
                sommaNumeri = sommaNumeri + i;
                System.out.println(i + "terzo");
            }

        }

        return sommaNumeri;
    }
    /*
     * SOLUZIONE PIÙ PULITA
     * 
     * public class Solution {
     * 
     * public int solution(int number) {
     * int sum=0;
     * 
     * for (int i=0; i < number; i++){
     * if (i%3==0 || i%5==0){sum+=i;}
     * }
     * return sum;
     * }
     * }
     */
}
