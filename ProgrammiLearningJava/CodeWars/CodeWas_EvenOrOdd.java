package ProgrammiLearningJava.CodeWars;

public class CodeWas_EvenOrOdd {

    /*
     * https://www.codewars.com/kata/53da3dbb4a5168369a0000fe/train/java
     * Create a function that takes an integer as an argument and returns "Even" for
     * even numbers or "Odd" for odd numbers.
     */

    public static void main(String[] args) {

        int number = 2;

        System.out.println(evenOrOdd(number));

    }

    public static String evenOrOdd(int number) {

        if (number % 2 == 0) {
            return "Even";
        }

        return "Odd";
    }
}
