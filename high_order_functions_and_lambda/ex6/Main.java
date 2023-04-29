package high_order_functions_and_lambda.ex6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        // Creating Stream from Datasource: Array
        String[] greetings = new String[] { "Hello!", "Hola!", "Bonjour!", "Hallo!" };
        Arrays.stream(greetings).forEach(greeting -> System.out.println(greeting));

        System.out.println("\n\n");

        try {
            // Creating Stream from Datasource: File
            Path path = Paths.get("high_order_functions_and_lambda/ex6/chorus.txt");

            // Lendo linha a linha do arquivo
            Files.lines(path).forEach(line -> System.out.println(line));
        } catch (IOException exception) {
            System.out.println(exception);
        }

    }
}
