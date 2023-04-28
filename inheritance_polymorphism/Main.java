package inheritance_polymorphism;

import inheritance_polymorphism.product.Pants;
import inheritance_polymorphism.product.Product;
import inheritance_polymorphism.product.Shirt;
import inheritance_polymorphism.product.Shirt.Size;

public class Main {
    public static void main(String[] args) {

        // Note que alguns métodos abaixo vem na realidade da classe PRODUCT
        Shirt shirt = new Shirt(10.99, "Red", "Nike", Size.SMALL);
        shirt.fold();

        Pants pants = new Pants(15.99, "Red", "Levi's", 32, 32);
        pants.fold();

    }   

    public static void productStore(Product product) {
        System.out.println("Thank you for purchasing " + product.getBrand() + " " + product.getClass().getSimpleName().toLowerCase() + " " + " Your total comes to " + product.getPrice());
    }
}
