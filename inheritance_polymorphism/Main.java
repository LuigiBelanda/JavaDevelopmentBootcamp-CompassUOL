package inheritance_polymorphism;

import inheritance_polymorphism.product.Pants;
import inheritance_polymorphism.product.Shirt;
import inheritance_polymorphism.product.Shirt.Size;

public class Main {
    public static void main(String[] args) {

        // Note que alguns métodos abaixo vem na realidade da classe PRODUCT
        Shirt shirt = new Shirt();
        shirt.setSize(Size.SMALL);
        shirt.setBrand("Nike");
        shirt.setPrice(49.99);
        shirt.setColor("Blue");
        shirt.fold();

        Pants pants = new Pants();
        pants.setWaist(32);
        pants.setLength(32);
        pants.setColor("BLACK");
        pants.setPrice(79.99);
        pants.setBrand("LEVI'S");
        pants.fold();

    }   
}
