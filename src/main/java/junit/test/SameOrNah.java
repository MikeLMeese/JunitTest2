package junit.test;

import java.util.Scanner;

public class SameOrNah {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Enter a word:");
        String firstWord = scanner.nextLine();
        System.out.println("Enter another word:");
        String secondWord = scanner.nextLine();
        butAreTheyTheSameTho(firstWord, secondWord);
    }

    public static String butAreTheyTheSameTho(String firstWord, String secondWord) {
        if (firstWord.equals(secondWord)) {
            return "The words are the same";
        } else {
            return "The words are different";
        }
    }
}