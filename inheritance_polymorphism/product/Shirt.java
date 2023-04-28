package inheritance_polymorphism.product;

// Aqui dizemos que a classe SHIRT extende os métodos e atributos da classe PRODUCT
// Ela herda isso tudo
public class Shirt extends Product {

    private Size size;

    public enum Size {
        SMALL, MEDIUM, LARGE
    }

    public Size getSize() {
        return this.size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

}
