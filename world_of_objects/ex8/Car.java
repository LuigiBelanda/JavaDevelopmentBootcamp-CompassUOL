package world_of_objects.ex8;

import java.util.Arrays;

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

        // Aqui criamos uma cópia do array que vem como parâmetro por que se não
        // Nosso objeto irá ficar referenciando o array original e se fizermos alguma 
        // alteração nele, nosso objeto também muda, o que não é bom.
        // Então criamos uma cópia dele para não fazermos mais referência ao array original
        this.parts = Arrays.copyOf(parts, parts.length);
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
