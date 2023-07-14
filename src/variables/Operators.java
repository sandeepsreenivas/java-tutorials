package variables;


// AND --> &&

/**
 * True and True -->  True
 * False and True -->  False
 * True and False
 * False and False
 * Remaining cases false
 */

// OR --> ||

/**
 * False or False --> False
 * Remaining it will be true
 *
 * */



public class Operators {

    public static void main(String[] args) {

        int c1 = 20;
        boolean a = c1 > 10; // <
        boolean b = c1 >= 20; // <=
        boolean c = true;
        System.out.println(!c);

        // increment and decrement

        // Pre increment and post increment
        // ++i and i++

        int i = 10;
        //i++; // i = i + 1;
        System.out.println(++i);
        System.out.println(i++);
        System.out.println(i);

        int j = 11;
        System.out.println(--j);
        System.out.println(j--);
        System.out.println(j);

        // m = 10 --> m += 2 --> m = m + 2

        int m = 10;
        m += 2;
        m -= 2;
        m *= 2;
        m /= 2;

    }

}

/**
 *
 * /**
 *  Take user inputs from terminal
 *
 *  * 1. Convert Centigrade to fahrenheit , f to c
 *  * 2. Calculate simple interest by taking principal, time and rate
 *  * 3. Calculate Average of any 5 numbers
 *  *
 *  * Consider proper variable naming conventions and print statements properly.
 *  *
 *
 */
