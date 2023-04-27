package world_of_objects.ex9;

public class Main {
    public static void main(String[] args) {
        // Com construtor
        String[] spareParts = new String[] { "Tires", "Keys" };
        Car nissan = new Car("Nissa", 10000, 2002, "Green", spareParts);
        // System.out.println("Make: " + nissan.getMake() + "\tPrice: " + nissan.getPrice() + "\tYear: " + nissan.getYear() + "\tColor: " + nissan.getColor() + "\tParts: " + nissan.getParts());
    
        System.out.println(nissan);
    }
}

        
