package variables;

public class typeConversion {
    public static void main(String[] args) {
        int ants = 2000;
        int purchasedBlocksOfCheese = 1;

        System.out.println("There are " + ants + " ants, and " + purchasedBlocksOfCheese + " block of cheese.");
        System.out.println("Each ant carried " + (purchasedBlocksOfCheese / ants) + " from the total cheese amount"); 
        System.out.println("Each ant carried " + ((double)purchasedBlocksOfCheese / ants) + " from the total cheese amount"); 

        // se colocarmos dentro dos () mais um par de () e dentro deste adicionar
        // O tipo de dado que queremos retornas podemos mudar a saída de dados

        double salary = 5423.94;
        int roundedSalary = (int)salary;
        System.out.println("\nMortgage Broker: What is your monthly salary in dollars?");
        System.out.println("My monthly salary is: " + salary);
        System.out.println("My monthly rounded salary is: " + roundedSalary);

        // Acima acontece a mesma coisa, pegamos e mudamos o tipo do dado salary para int
        // e armazenamos ele em uma var int
    }
}
