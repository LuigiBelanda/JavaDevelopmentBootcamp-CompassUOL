package world_of_objects.ex5;

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
        System.out.println("Make: " + nissan.getMake() + "\tPrice: " + nissan.getPrice() + "\tYear: " + nissan.getYear() + "\tColor: " + nissan.getColor());
    
        nissan.setColor("Jet Black");
        nissan.setPrice(nissan.getPrice() / 2);
        System.out.println("Make: " + nissan.getMake() + "\tPrice: " + nissan.getPrice() + "\tYear: " + nissan.getYear() + "\tColor: " + nissan.getColor());
    

        // Aqui passamos como referência para o objeto nissan2 o objeto nissan
        // Se fizermos alguma mudança em alguns dos dois, essa mudança reflete no original e vice-versa
        Car nissan2 = nissan;

        nissan2.setColor("Yellow");
        nissan.setColor("Orange");
        nissan2.setColor("Blue");
        nissan.setColor("Purple");
        nissan2.setColor("Fuchsia");
        nissan.setColor("Beige");
        System.out.println("\n\nMake: " + nissan.getMake() + "\tPrice: " + nissan.getPrice() + "\tYear: " + nissan.getYear() + "\tColor: " + nissan.getColor());
        System.out.println("Make: " + nissan2.getMake() + "\tPrice: " + nissan2.getPrice() + "\tYear: " + nissan2.getYear() + "\tColor: " + nissan2.getColor());
    
    
        // Copy constructor, estamos criando um nosso objeto nissan3 passando como parametro o 
        // objeto nissan, assim se quisermos mudar algo no nissan3 podemos mudar
        // pois ele não referência o objeto nissan original
        Car nissan3 = new Car(nissan);
        
        nissan3.setColor("Yellow");
        nissan.setColor("Orange");
        nissan3.setColor("Blue");
        nissan.setColor("Purple");
        nissan3.setColor("Fuchsia");
        nissan.setColor("Beige");
        System.out.println("\n\nMake: " + nissan.getMake() + "\tPrice: " + nissan.getPrice() + "\tYear: " + nissan.getYear() + "\tColor: " + nissan.getColor());
        System.out.println("Make: " + nissan3.getMake() + "\tPrice: " + nissan3.getPrice() + "\tYear: " + nissan3.getYear() + "\tColor: " + nissan3.getColor());
    }
}

        
