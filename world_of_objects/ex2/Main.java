package world_of_objects.ex2;

public class Main {
    public static void main(String[] args) {
        
        // Sem construtor 

        /*
        Car nissan = new Car();

        nissan.make = "Nissan";
        nissan.price = 10000;
        nissan.year = 2002;
        nissan.color = "Green";
        */

        // Com construtor
        Car nissan = new Car("Nissa", 10000, 2002, "Green");
    }
}
