package concurrency_multithreading.joining_threads;

import java.util.Scanner;

public class Main {

    static final double TARGET = 0.5;
    static final double PRECISION = 0.000000001;

    static double result = 0;

    public static void main(String[] args) {

        Runnable runnable = () -> result = generateNumber();
        Thread thread = new Thread(runnable);
        thread.start();

        double precision = difference(result);

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name to generate number: ");
        scan.nextLine();
        scan.close();

        // Fazendo a main esperar a outra thread terminar
        try {
            thread.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        
        System.out.println("The computer returned a value of: " + result);
        System.out.println("The value was generated to a precision of : " + precision);
    }

    /**
     * Function name: generateNumber
     * 
     * @return double
     * 
     *         Inside the function:
     *         1. Generates a number close to the TARGET to a precision of
     *         PRECISION.
     * 
     */
    public static double generateNumber() {
        double number = Math.random();
        double difference = difference(number);

        while (difference > PRECISION) {
            number = Math.random();
            difference = difference(number);
        }

        return number;
    }

    public static double difference(double number) {
        return Math.abs(TARGET - number);
    }
}