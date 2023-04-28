package static_final.final_ex;

public class Main {
    public static void main(String[] args) {

        Employee john = new Employee("John", 45);
        Employee lisa = new Employee("Lisa", 20);

        // Note que abaixo quem chama as variáveis de MAX_AGE e MIN_AGE 
        // é a própria classe, pois são atributos que pertencem a classe
        // E não as instancias de objetos.
        System.out.println("Retirement Age: " + Employee.MAX_AGE);
        System.out.println("Minimum Working Age: " + Employee.MIN_AGE);

        System.out.println(john.getName() + ", you can retire in " + (Employee.MAX_AGE - john.getAge()) + " years.");
        System.out.println(lisa.getName() + ", you have been eligible to work for " + (lisa.getAge() - Employee.MIN_AGE) + " years.");

    }
}
