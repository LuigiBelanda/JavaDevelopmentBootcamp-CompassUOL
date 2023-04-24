package variables;

public class variables {
    public static void main(String[] args) {
        int peoples = 5;
        System.out.println(peoples);

        int otherPeoples = peoples;
        System.out.println(otherPeoples);

        // Todas as vars tem um tamanho que podem ocupar na memporia
        // No caso do int ele ocupa 4 bytes e pode receber de
        // -2147483648 até 2147483647
        // Se excedermos esse valor tanto para o negativo quanto para o positivo
        // Iremos receber uma mensagem de erro

        int maxValueOk = 2147483647;

        // int maxValueNotOk = 2147483648;
        // The literal 2147483648 of type int is out of range
    }
}
