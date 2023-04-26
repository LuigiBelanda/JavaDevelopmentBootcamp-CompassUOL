package world_of_objects.ex3;

public class Car {
    // Atributos
    private String make;
    private double price;
    private int year;
    private String color;

    // Construtor
    public Car (String make, double price, int year, String color) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
    }

    // Getters
    public String getMake() {
        return make;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }
}
