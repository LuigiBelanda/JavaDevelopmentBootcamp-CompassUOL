package exception_handling.unchecked_exceptions.argument_validation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        User user = new User();
        System.out.println("We are setting up your user account.");

        System.out.print("Your username is currently " + user.getUsername() + ". Please update it here: ");
        String username = scanner.nextLine();

        if (username.isBlank()) {
            System.out.println("Sorry, that is an invalid username!");
        } else {
            user.setUsername(user.getUsername());
        }

        System.out.print("Your age is currently " + user.getAge() + ". Please update it here: ");
        int age = scanner.nextInt();

        if (scanner.hasNextInt()) {
            if (age < 0) {
                System.out.println("Age cannot be negative");
            } else {
                user.setAge(scanner.nextInt());
            }
        } else {
            scanner.nextLine();
        }
        
        scanner.close();
    }
}