package func_java;

public class ReturnValuesString {
    public static void main(String[] args) {
        double area1 = calculateArea(2, 3);
        System.out.println("\nArea 1: " + area1);

        printArea(2, 3, area1);

        double area2 = calculateArea(5, 2);
        System.out.println("\nArea 2: " + area2);

        double area3 = calculateArea(3, 10);
        System.out.println("\nArea 3: " + area3);

        String englishExplanation1 = explainArea("English");
        String englishExplanation2 = explainArea("French");
        String englishExplanation3 = explainArea("Spanish");
        String englishExplanation4 = explainArea("Italian");

        System.out.println(englishExplanation1);
        System.out.println(englishExplanation2);
        System.out.println(englishExplanation3);
        System.out.println(englishExplanation4);
    }

    /**
     * Function name: calculateArea 
     * 
     * @param length        (double)
     * @param width         (double)
     * @return              (double)
     */
    public static double calculateArea(double length, double width) {
        if (length < 0 || width < 0) {
            System.out.println("INVALID DIMENSIONS");
            System.exit(0);
        }

        double area = width * length;
        return area;
    }

    /**
     * Function name: explainArea
     * 
     * @param language      (string)
     * @return              (string)
     */
    public static String explainArea(String language) {
        switch (language) {
            case "English":
                return "\nArea equals length * width";
            case "French":
                return "\nLa surface est egale a la longueur * la largeur";
            case "Spanish":
                return "\nArea es igual a largo * ancho";
            default:
                return "\nLanguage not available";
        }
    }

    /**
     * 
     * Function name: printArea
     * 
     * @param length    (double)
     * @param width     (double)
     * @param area      (double)
     * 
     */
    public static void printArea(double length, double width, double area) {
        System.out.println("Width (" + width + ") * length (" + length + ") = " + area);
    }
}