package func_java;

import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.println("Enter three numbers between 1 and 6");
        System.out.println("Number 1: ");
        int num1 = scanner.nextInt();
        System.out.println("Number 2: ");
        int num2 = scanner.nextInt();
        System.out.println("Number 3: ");
        int num3 = scanner.nextInt();

        scanner.close();

        // boolean areLessThan1Result = areLessThan1(num1, num2, num3);
        // boolean areHigherThan6Result = areHigherThan6(num1, num2, num3);

        if (areLessThan1(num1, num2, num3) || areHigherThan6(num1, num2, num3)) {
            System.out.println("Error: You probably entered numbers less than 1 and/or greater than 6");
            System.exit(0);
        }

        int sumNumbers = num1 + num2 + num3;
        int sumDiceRolls = roll1 + roll2 + roll3;
        // userWon(sumNumbers, sumDiceRolls);

        System.out.println("\nYour sum: " + sumNumbers + "\t Dice sum: " + sumDiceRolls);

        if (userWon(sumNumbers, sumDiceRolls)) {
            System.out.println("You Won");
        } else {
            System.out.println("Better luck next time!");
        }
    }

    public static boolean areLessThan1(int num1, int num2, int num3) {
        return (num1 < 1 || num2 < 1 || num3 < 1);
    }

    public static boolean areHigherThan6(int num1, int num2, int num3) {
        return (num1 > 6 || num2 > 6 || num3 > 6);
    }

    public static boolean userWon(int sumNumbers, int sumDiceRolls) {
        return (sumNumbers > sumDiceRolls && (sumNumbers - sumDiceRolls) < 3);
    }

    public static int rollDice() {
        // Normal Math.random = min: 0 -> max: 0.999999999
        // Math.random in the next line = min: 0 -> 5.99999999
        double randomNumber = Math.random() * 6;

        // min: 1 -> max: 6.9999999
        randomNumber += 1;

        // min: 1 -> max 6
        return (int) randomNumber;
    }
}
