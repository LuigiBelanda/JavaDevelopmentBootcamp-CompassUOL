package high_order_functions_and_lambda.ex5;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Terminal operations
        // Portanto, todas essas operações têm uma coisa em comum: encerram o pipeline.
        // Alguns produzem um efeito colateral, alguns retornam um resultado final.
        // Todas as Terminal Operations encerram a pipeline

        // *******************forEach*******************
        List<String> usernames = Arrays.asList("blueEyedDreamer", "FiercePhoenix", "Wildflower87", "SerendipitousSurprise");
        
        usernames.stream()
            .map(username -> username.toUpperCase())
            .forEach(username -> System.out.println(username));

        // *******************toList*******************
        List<String> upperUsernames = usernames.stream()
            .map(username -> username.toUpperCase())
            .toList();


        // *******************reduce*******************

        List<Double> earnings = Arrays.asList(40.50, 60.00, 120.50, 20.00, 50.50, 20.00);
        Double totalEarnings = earnings.stream().reduce(0.00, ((x, y) -> x + y));
        System.out.println("\nYour total earnings are $ " + totalEarnings);
       
        // *******************findFirst*******************
        List<String> aisles = Arrays.asList("apples", "bananas", "candy", "chocolate", "coffee", "tea");
        System.out.print("\nDo you guys sell coffee? ");

        String result = aisles.stream()
            .filter(aisle -> aisle.equals("coffe"))
            .findFirst()
            .orElse(null);

        String response = result == null ?  "No we don't!" : "Sure we do!";

        // *******************count*******************        
        List<Integer> numbers = Arrays.asList(1, 1, 1, 2, 2, 1, 1, 2, 2, 2, 2, 3, 4, 1);
        System.out.println("\nHow many times does the number 1 repeat?");
        
        long count = numbers.stream().filter(number -> number == 1).count(); 

        System.out.println("The number 1 repeats " + count + " times");
    }   
}
