package variables;

public class varLong {
    public static void main(String[] args) {
        // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        // Usado para guardar números enormes

        long globalPopulation = 8000000000L;
        System.out.println("The global population is " + globalPopulation);

        globalPopulation = 8_500_000_000L;
        System.out.println("The global population is " + globalPopulation);

        // Devemos usar o prefixo L no final para ele entender que é Long
        // E podemos usar o underscore (_) para separar os dígitos e melhorar a legibilidade
    }
}
