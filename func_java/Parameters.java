package func_java;

import java.util.Scanner;

public class Parameters {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Length: ");
        double length = scan.nextDouble();

        System.out.println("\nWidth: ");
        double width = scan.nextDouble();

        calculateArea(length, width);
    }

    public static void calculateArea(double length, double width) {
        System.out.println("\nArea = " + length * width);
    }
}
