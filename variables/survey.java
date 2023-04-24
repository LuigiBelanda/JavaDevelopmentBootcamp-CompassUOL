package variables;

import java.util.Scanner;

public class survey {
    public static void main(String[] args) {

        //*********PART A: PICKING UP THE USER'S ANSWERS*********
        System.out.println("Welcome. Thank you for taking the survey");

        // https://www.devmedia.com.br/como-funciona-a-classe-scanner-do-java/28448
        Scanner scanner = new Scanner(System.in);

        int counter = 0;

        System.out.println("\nWhat is your name?");
        String name = scanner.nextLine();
        counter++;

        // next() lê a String até o primeiro espaço enquanto nextLine() lê até encontrar uma quebra de linha.

        System.out.println("\nHow much money do you spend on coffee?");
        double coffeePrice = scanner.nextDouble();
        counter++;

        System.out.println("\nHow much money do you spend on fast food?");
        double foodPrice = scanner.nextDouble();
        counter++;

        System.out.println("\nHow many times a week do you buy coffee?");
        int coffeeAmount = scanner.nextInt();
        counter++;

        System.out.println("\nHow many times a week do you buy fast food?");
        int foodAmount = scanner.nextInt();
        counter++;

        scanner.close();

        //*********PART B: RESPONDING TO THE USER**********
        System.out.println("\n\nThank you " + name + " for answering all " + counter + " questions");
        System.out.println("Weekly, you spend R$ " + (coffeePrice * coffeeAmount) + " on coffee");
        System.out.println("Weekly, you spend R$ " + (foodPrice * foodAmount) + " on food");
    }
}
