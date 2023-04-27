package exception_handling.checked_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExampleOne {
    public static void main(String[] args) {
        // FileInputStream fis = new
        // FileInputStream("exception_handling/checked_exceptions/greetings.txt");
        // exception_handling/checked_exceptions/greetings.txt

        try {
            FileInputStream fis = new FileInputStream("exception_handling/checked_exceptions/greetings.txt");

            Scanner scanner = new Scanner(fis);
            System.out.println(scanner.nextLine());
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Process complete");
        }
    }

}