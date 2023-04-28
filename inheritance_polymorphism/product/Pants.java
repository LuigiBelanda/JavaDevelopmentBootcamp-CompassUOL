package inheritance_polymorphism.product;

// Aqui dizemos que a classe PANTS extende os métodos e atributos da classe PRODUCT
// Ela herda isso tudo
public class Pants extends Product {

    private int waist;
    private int length;

    // Constructor
    public Pants(double price, String color, String brand, int waist, int length) {
        // super - chama o construtor principal, superclass ou classe pai
        // A palavra-chave super invoca o construtor pai para atualizar os campos herdados e o construtor filho atualiza os campos restantes.
        super(price, color, brand);
        this.waist = waist;
        this.length = length;
    }

    public int getWaist() {
        return this.waist;
    }

    public void setWaist(int waist) {
        this.waist = waist;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void fold() {
        System.out.println("\nHold pants upright");
        System.out.println("Fold obe leg over the other");
        System.out.println("Fold pants from bottom in thirds");
    }

    @Override
    public void wear() {
        System.out.println("The " + waist + " " + length + " pants look great on you!");
    }
}
