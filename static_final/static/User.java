public class User {

    // Pertence ao objeto instanciado 
    private String firstName;
    private String lastName;

    // Static = pertence a classe
    // A classe pode invocar um método estático para recuperar seu campo estático.
    // Não é necessário instanciar um objeto para esse atributo ou até mesmo método mais abaixo
    private static int userCount = 0;

    public User(String firstName, String lastName) {
        userCount++;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static int getUserCount() {
        return userCount;
    }
}