package booleans_conditions;

public class switchStatements {
    public static void main(String[] args) {

        // Section 1: Weather conditions
        String weather = "sunny";

        switch (weather) {
            case "sunny":
                System.out.println("\nSunny");
                break;
            case "cloudy":
                System.out.println("\nCloudy");
                break;
            case "rainy":
                System.out.println("\nRainy");
                break;
            case "snowy":
                System.out.println("\nSnowy");
                break;
            default:
                break;
        }

        // Determine what to wear based on the weather (e.g., sunny, cloudy, rainy,
        // snowy)
        // Decide whether to use if-else or switch



        // Section 2: User role
        int role = 2;

        switch (role) {
            case 1:
                System.out.println("\nAdmin");
                break;
            case 2:
                System.out.println("\nEditor");
                break;
            case 3:
                System.out.println("\nUser");
                break;
            default:
                System.out.println("Please contact HR");;
        }

        // Determine user access level based on the role (e.g., 1: admin, 2: editor, 3:
        // user)
        // Decide whether to use if-else or switch



        // Section 3: Temperature and humidity
        int temperature = 75;
        int humidity = 65;

        if (temperature >= 80 && humidity >= 60) {
            System.out.println("\nIt's too hot and humid");
        } else if (temperature >= 80) {
            System.out.println("\nIt's too hot");
        } else if (temperature <= 60 && humidity >= 60) {
            System.out.println("\nIt's too cold and humid");
        } else if (temperature <= 60) {
            System.out.println("\nIt's too cold");
        } else {
            System.out.println("\nIt's comfortable");
        }

        // Determine the comfort level based on both temperature and humidity (e.g., too
        // hot, too cold, comfortable)
        // Decide whether to use if-else or switch



        // Section 5: Age and income
        int age = 25;
        int income = 50000;
        // Determine eligibility for a specific credit card based on age and income
        // Decide whether to use if-else or switch



        // Section 1: Traffic light colors
        String lightColor = "green";
        // Determine what action to take based on the traffic light color (e.g., green,
        // yellow, red)
        // Decide whether to use if-else or switch



        // Section 2: Exam grade
        int grade = 85;
        // Determine the letter grade based on the numeric grade (e.g., A, B, C, D, F)
        // Decide whether to use if-else or switch



        // Section 3: Browser type
        String browser = "Chrome";
        // Check if the browser is one of the following: Chrome, Firefox, Safari, Edge,
        // or Opera
        // Decide whether to use if-else or switch
    }
}
