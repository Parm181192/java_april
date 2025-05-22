package may10;

import java.util.Scanner;

public class ForCalculator {
    public static void main(String[] args) {

        int i;
        do {
            System.out.println("Welcome to my Calculator");
            System.out.println("*****************************");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Modulus");
            System.out.println("0. Exit");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the option");
            int option = scanner. nextInt();
            System.out.println("Enter first number");
            float a = scanner. nextFloat();
            System.out.println("Enter second number");
            float b = scanner.nextFloat();
            switch (option) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    subtract(a, b);
                    break;
                case 3:
                    multiplication(a, b);
                    break;
                case 4:
                    division(a, b);
                    break;
                case 5:
                    modulus(a, b);
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
            }
            System.out.println("Do you still want to use Calculator, Press 1 for Yes and Press 0 for No ");
            i = scanner.nextInt();
        }while (i!=0);
    }
    public static void sum(float a, float b)
    {
        float c = a + b;
        System.out.println("Result is: " + c);
    }
    public static void subtract(float a, float b)
    {
        float c = a - b;
        System.out.println("Result is: " + c);
    }
    public static void multiplication(float a, float b)
    {
        float c = a * b;
        System.out.println("Result is: " + c);
    }
    public  static void division( float a, float b)
    {
       float c = a / b ;
        System.out.println("Result is: " + c);
    }
    public static void modulus(float a, float b)
    {
        float c = a % b;
        System.out.println("Result is: " + c);
    }

}

