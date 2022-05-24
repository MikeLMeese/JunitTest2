package junit.test;

import java.util.Scanner;

public class DivideMethod {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Enter a number to be sacrificed:");
        int firstNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter a number to do the sacrifice");
        int secondNum = Integer.valueOf(scanner.nextLine());

        System.out.println("Commence the sacrifice!");
        double result = divide(firstNum, secondNum);
        System.out.println(firstNum + " / " + secondNum + " = " + result);
    }
    public static double divide(double firstNum, double secondNum) {
        return (firstNum / secondNum);
    }
}