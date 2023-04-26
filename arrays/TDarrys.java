package arrays;

import java.util.Arrays;

public class TDarrys {
    public static void main(String[] args) {
        int[][] grades = new int[3][4];

        System.out.println("\n\tHarry: \t\t" + Arrays.toString(grades[0]));
        System.out.println("\tRon: \t\t" + Arrays.toString(grades[1]));
        System.out.println("\tHermione: \t" + Arrays.toString(grades[2]));

        grades[0][0] = 72; 
        grades[0][1] = 74;
        grades[0][2] = 78;
        grades[0][3] = 76;

        System.out.println("\n\tHarry: \t\t" + Arrays.toString(grades[0]));
        System.out.println("\tRon: \t\t" + Arrays.toString(grades[1]));
        System.out.println("\tHermione: \t" + Arrays.toString(grades[2]));

        grades[1][0] = 65; 
        grades[1][1] = 64;
        grades[1][2] = 61;
        grades[1][3] = 67;

        System.out.println("\n\tHarry: \t\t" + Arrays.toString(grades[0]));
        System.out.println("\tRon: \t\t" + Arrays.toString(grades[1]));
        System.out.println("\tHermione: \t" + Arrays.toString(grades[2]));

        grades[2][0] = 95; 
        grades[2][1] = 98;
        grades[2][2] = 99;
        grades[2][3] = 100;

        System.out.println("\n\tHarry: \t\t" + Arrays.toString(grades[0]));
        System.out.println("\tRon: \t\t" + Arrays.toString(grades[1]));
        System.out.println("\tHermione: \t" + Arrays.toString(grades[2]));



        int[][] grades2 = {
            {72, 74, 78, 76},
            {65, 64, 61, 67},
            {95, 98, 99, 100}
        };

        System.out.println("\n\tHarry grades2: \t\t" + Arrays.toString(grades2[0]));
        System.out.println("\tRon grades2: \t\t" + Arrays.toString(grades2[1]));
        System.out.println("\tHermione grades2: \t" + Arrays.toString(grades2[2]));

        // How to get onde data
        // grades[index][index]
        // grades[0][1] = 72
    }
}
