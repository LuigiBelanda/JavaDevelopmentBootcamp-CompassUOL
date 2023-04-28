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

}
