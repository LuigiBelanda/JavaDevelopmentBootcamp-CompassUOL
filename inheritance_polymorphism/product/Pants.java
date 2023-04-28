package inheritance_polymorphism.product;

// Aqui dizemos que a classe PANTS extende os métodos e atributos da classe PRODUCT
// Ela herda isso tudo
public class Pants extends Product {

    private int waist;
    private int length;

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
}
