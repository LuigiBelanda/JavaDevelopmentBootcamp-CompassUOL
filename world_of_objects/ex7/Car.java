package world_of_objects.ex7;

public class Car {
    // Atributos
    private String make;
    private double price;
    private int year;
    private String color;
    private String[] parts;


    // Construtor
    public Car (String make, double price, int year, String color, String[] parts) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;
        this.parts = parts;
    }



    // Constructor copy
    public Car (Car source) {
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
        this.parts = source.parts;
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

    public String[] getParts() { 
        return parts;
    }


    // Setters
    public void setMake(String make) {
        this.make = make;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setParts(String[] parts) {
        this.parts = parts;
    }



    // Métodos
    public void drive() {
        System.out.print("\nDrive to the exit - " + make + " - " + year + " - " + color + " \n");
    }
}
