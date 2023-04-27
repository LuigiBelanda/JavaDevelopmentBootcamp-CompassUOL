package exception_handling.checked_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExampleTwo {
    public static void main(String[] args) {
        try {
            readFile("exception_handling/checked_exceptions/greetings.txt");            
        } catch (FileNotFoundException e) {
            // TODO: handle exception
        } finally {
            System.out.println("Process Complete");
        }
    }
    
    // Aqui com o Throws estamos dizendo que podemos lançar uma exceção do tipo FileNotFoundException
    // e tratar ela como acima no try catch
    public static void readFile(String fileName) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Scanner scanner = new Scanner(fis);
        System.out.println(scanner.nextLine());
        scanner.close();
    }
}