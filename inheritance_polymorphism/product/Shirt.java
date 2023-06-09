package inheritance_polymorphism.product;

// Aqui dizemos que a classe SHIRT extende os métodos e atributos da classe PRODUCT
// Ela herda isso tudo
public class Shirt extends Product {

    private Size size;

    public enum Size {
        SMALL, MEDIUM, LARGE
    }

    // Constructor
    public Shirt(double price, String color, String brand, Size size) {
        // super - chama o construtor principal, superclass ou classe pai
        // A palavra-chave super invoca o construtor pai para atualizar os campos herdados e o construtor filho atualiza os campos restantes.
        super(price, color, brand);
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }


    @Override
    public void fold() {
        System.out.println("\nLat shirt on a flat surface");
        System.out.println("Fold the shirt sideways");
        System.out.println("Bring sleeves in");
        System.out.println("Fold from botton up");
    }

    @Override
    public void wear() {
        System.out.println("The " + this.size + " shirt suits you well!");
    }
}
