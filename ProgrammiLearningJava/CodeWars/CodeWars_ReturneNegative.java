package ProgrammiLearningJava.CodeWars;

public class CodeWars_ReturneNegative {

    public static void main(String[] args) {
        /*
         * https://www.codewars.com/kata/55685cd7ad70877c23000102/train/java
         * 
         * In this simple assignment you are given a number and have to make it
         * negative. But maybe the number is already negative?
         */

        System.out.print(makeNegative(465465));

    }

    public static int makeNegative(final int x) {

        int controllo = 0;
        int tmp = x;

        if (x > controllo) {

            tmp = tmp - (tmp * 2);

        }

        return tmp;

    }

}
