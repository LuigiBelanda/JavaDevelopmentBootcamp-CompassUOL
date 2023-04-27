package world_of_objects.ex10;

import java.util.Arrays;

public class Car {
    // Atributos
    private String make;
    private double price;
    private int year;
    private String color;
    private String[] parts;



    // Construtor
    public Car(String make, double price, int year, String color, String[] parts) {
        this.make = make;
        this.price = price;
        this.year = year;
        this.color = color;

        // Aqui criamos uma cópia do array que vem como parâmetro por que se não
        // Nosso objeto irá ficar referenciando o array original e se fizermos alguma
        // alteração nele, nosso objeto também muda, o que não é bom.
        // Então criamos uma cópia dele para não fazermos mais referência ao array
        // original
        this.parts = Arrays.copyOf(parts, parts.length);
    }



    // Constructor copy
    public Car(Car source) {
        this.make = source.make;
        this.price = source.price;
        this.year = source.year;
        this.color = source.color;
        this.parts = Arrays.copyOf(parts, parts.length);
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
        return Arrays.copyOf(parts, parts.length);
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
        this.parts = Arrays.copyOf(parts, parts.length);
    }



    // Métodos
    public void drive() {
        System.out.print("\nDrive to the exit - " + make + " - " + year + " - " + color + " \n");
    }



    // Utilizamos o override por que estamos sobrescrevendo um método já existente no Java
    // Mas ao iremos utilizar da maneira que está abaixo
    @Override
    public String toString() {
        return "\nMake: " + this.make + ".\n"
                + "Price: " + this.price + ".\n"
                + "Year: " + this.year + ".\n"
                + "Color: " + this.color + ".\n"
                + "Parts: " + Arrays.toString(parts) + ".\n";

    }

    // https://www.geeksforgeeks.org/overriding-tostring-method-in-java/
    // Explicação de saída: A saída é a nome da classe, 
    // depois sinal ‘ @ ’ e no final hashCode de o objeto, esse é o toString padrão. 
    // Todas as classes em Java herdam da classe Object, 
    // direta ou indiretamente. A classe Object possui 
    // alguns métodos básicos, como clone ( ), toString ( ), equals ( ), ... etc. 
    // O método padrão toString ( ) em Impressões de objetos “ nome da classe @ código de hash ”. 
    // Podemos substituir o método toString ( ) em nossa classe para imprimir a saída adequada como fizemos acima.
}
