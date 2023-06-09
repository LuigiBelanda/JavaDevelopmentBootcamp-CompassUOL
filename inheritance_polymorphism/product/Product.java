package inheritance_polymorphism.product;

// Note que aqui temos uma classe ABSTRACT 
// Não podem ser criados objetos diretamente dela, ela não 
// pode ser instanciada
public abstract class Product {
    private double price;
    private String color;
    private String brand;

    // Constructor
    public Product(double price, String color, String brand) {
        this.price = price;
        this.color = color;
        this.brand = brand;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void fold() {
        System.out.println("\nFolding my " + this.getBrand() + " " + this.getClass().getSimpleName());
    }

    // Só podemos criar métodos ABSTRACT se a classe for ABSTRACT
    // Esses métodos não tem corpo, pois cabe as classes que herdarem ele
    // fazer um Override e sobrescrever este método;
    public abstract void wear();
}