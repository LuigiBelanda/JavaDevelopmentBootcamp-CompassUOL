package bigdecimals;

import java.math.BigDecimal;

public class Decimals {
    public static void main(String[] args) {

        /*
        double x = 0.1;

        System.out.println(x);

        double y = 0.2;
        double z = x + y;
        
        System.out.println(z);
        */

        BigDecimal x = new BigDecimal("0.1");

        System.out.println(x);

        BigDecimal y = new BigDecimal("0.2");

        System.out.println(y.subtract(x));
    }

}
