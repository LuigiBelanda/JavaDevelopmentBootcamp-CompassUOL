package func_java;

public class ReturnValues {
    public static void main(String[] args) {
        double area1 = calculateArea(2, 3);
        System.out.println("\nArea 1: " + area1);

        double area2 = calculateArea(5, 2);
        System.out.println("\nArea 2: " + area2);

        double area3 = calculateArea(3, 10);
        System.out.println("\nArea 3: " + area3);
    }

    public static double calculateArea(double length, double width) {
        double area = width * length; 
        return area;
    }
}
