package arrays;

import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\n\n/************ Javapedia ************/");
        System.out.println("How many historical figures will you register?");
        int people = scan.nextInt();

        scan.nextLine();

        String[][] database = new String[people][3];

        for (int i = 0; i < database.length; i++) {
            System.out.println("\nFigure - [" + (i + 1) + "]");

            System.out.print("Name: ");
            database[i][0] = scan.nextLine();

            System.out.print("Date of birthday: ");
            database[i][1] = scan.nextLine();

            System.out.print("Occupation: ");
            database[i][2] = scan.nextLine();

            System.out.print("\n");
        }

        System.out.println("\n\nValues to stored:");
        print2DArray(database);

        System.out.print("\n\nWho do you want the information on?: ");
        String name = scan.nextLine();

        for (int i = 0; i < database.length; i++) {
            if (database[i][0].equals(name)) {
                System.out.print("\nName: " + database[i][0]);
                System.out.print("\nDate of birthday: " + database[i][1]);
                System.out.print("\nOccupation: " + database[i][2]);
                System.out.print("\n");
            }
        }
    }

    public static void print2DArray(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("\t");
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
