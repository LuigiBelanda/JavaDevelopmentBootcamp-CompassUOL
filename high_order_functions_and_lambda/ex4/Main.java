package high_order_functions_and_lambda.ex4;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Double> prices = Arrays.asList(341.67, 209.32, 88.41, 269.99, 68.49, 499.99, 28.12, 354.38);

        // Criamos uma stream quando temos muitos dados e precisamos
        // Fazer várias operações com eles, assim a gente divide toda a informação
        // Em pequenas partes que vão andar pela na nossa pipeline e serem tratadas, filtradas etc
        // Assim conseguimos deixar bem mais nítido o que cada etapa da nossa pipeline está
        // fazendo com os nossos dados
        prices.stream()
            .filter((price -> {
                return price > 100;
            })).map((price -> {
                return price - 20;
            })).sorted((right, left) -> {
                return right.compareTo(left);
            }).map((price -> {
                return "$" + price;
            })).forEach((price -> {
                System.out.println(price);
            }));

    }
}