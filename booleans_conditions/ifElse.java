package booleans_conditions;

public class ifElse {

    public static void main(String[] args) {

        int chemistryGrade = 95;
        int biologyGrade = 75;
        System.out.println("\nMe: Hi Java, did I score better in biology?");

        if (biologyGrade > chemistryGrade) {
            System.out.println("Java: True");
        } else {
            System.out.println("Java: False");
        }



        double sales = 37.55;
        double costs = 5.55;
        System.out.println("\nMe: Hi Java, did we make money?");

        if (sales > costs) {
            System.out.println("Java: True");
        } else {
            System.out.println("Java: False");
        }



        double temperature = 15.5;
        double targetTemperature = 20.0;
        System.out.println("\nMe: Hi Java, is the temperature colder than our target?");
        
        if (temperature < targetTemperature) {
            System.out.println("Java: True");
        } else {
            System.out.println("Java: False");
        }



        int currentSpeed = 60;
        int speedLimit = 70;
        System.out.println("\nMe: Hi Java, am I driving slower than the speed limit?");
        
        if (currentSpeed < speedLimit) {
            System.out.println("Java: True");
        } else {
            System.out.println("Java: False");
        }



        int age = 45;
        int retirementAge = 65;
        System.out.println("\nMe: Hi Java, am I old enough to retire?");
        
        if (age >= retirementAge) {
            System.out.println("Java: True");
        } else {
            System.out.println("Java: False");
        }



        char myGrade = 'A';
        char bestGrade = 'A';
        System.out.println("\nMe: Hi Java, did I get the best possible grade?");
        
        if (myGrade == bestGrade) {
            System.out.println("Java: True");
        } else {
            System.out.println("Java: False");
        }



        String word = "hello";
        String secondWord = "hello";
        System.out.println("\nMe: Are the two words the same?");
        
        if (word.equals(secondWord)) {
            System.out.println("Java: True");
        } else {
            System.out.println("Java: False");
        }


        
        String thirdWord = "hello";
        String fourthWord = "goodbye";
        System.out.println("\nMe: Are the two words different?");
        
        if (!thirdWord.equals(fourthWord)) {
            System.out.println("Java: True");
        } else {
            System.out.println("Java: False");
        }
    }
}
