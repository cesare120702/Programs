package ProgrammiLearningJava.CodeWars;

public class CodeWars_DisemvowelTrolls {

    public static void main(String[] args) {
        /*
         * https://www.codewars.com/kata/52fba66badcd10859f00097e/train/java
         * 
         * Trolls are attacking your comment section!
         * 
         * A common way to deal with this situation is to remove all of the vowels from
         * the trolls' comments, neutralizing the threat.
         * 
         * Your task is to write a function that takes a string and return a new string
         * with all vowels removed.
         * 
         * For example, the string "This website is for losers LOL!" would become
         * "Ths wbst s fr lsrs LL!".
         * 
         * Note: for this kata y isn't considered a vowel.
         */
        String str = "This website is for losers LOL!";
        System.out.println(Troll.disemvowel(str));

    }

    static class Troll {
        public static String disemvowel(String str) {

            str = str.replaceAll("[aeiouAEIOU]", "");

            return str;
        }
    }
}
