package variables;

/**
 * Scanner
 */

import java.util.*;

public class UserInputs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter first number : ");
//        int a = sc.nextInt();
//        System.out.println("Enter second number : ");
//        int b = sc.nextInt();
//        int c = a + b;
//        System.out.println("Addition : " + c);

//        System.out.println("Enter first number : ");
//        float a = sc.nextFloat();
//        System.out.println("Enter second number : ");
//        float b = sc.nextFloat();
//        float c = a + b;
//        System.out.println("Addition is : " + c);

        System.out.println("Enter first number : ");
        double a = sc.nextDouble();
        System.out.println("Enter second number : ");
        int b = sc.nextInt();
        double c = a + b;
        System.out.println("Addition is : " + c);



    }

}
