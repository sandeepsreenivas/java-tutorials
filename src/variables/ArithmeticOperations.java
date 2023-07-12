package variables;

/**
 * add, sub, mult, div, mod
 */

public class ArithmeticOperations {
    public static void main(String[] args) {

        int a = 10, b = 20;
        int a1 = 24, b1 = 10;
        int a2 = 24, b2 = -10;
        int a3 = -24, b3 = -10;
        int a4 = -24, b4 = 10;
        int c = a + b;
        double d = a - b;
        int mul = a * b;
        int div = a / b;

        int rem = a % b;
        int rem1 = a1 % b1;
        int rem2 = a2 % b2;
        int rem3 = a3 % b3;
        int rem4 = a4 % b4;

        /**
         * Irrespective of denominator, whenever
         * numerator is +ve , remainder will be +ve
         * numerator is -ve , remainder will be -ve
         */


        System.out.println(a+b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(rem);
        System.out.println(rem1);
        System.out.println(rem2);
        System.out.println(rem3);
        System.out.println(rem4);
    }
}

/**
 *
 * 1. Convert Centigrade to fahrenheit
 * 2. Calculate simple interest by taking principal, time and rate
 * 3. Calculate Average of any 5 numbers
 *
 * Consider proper variable naming conventions and print statements properly.
 *
 */
