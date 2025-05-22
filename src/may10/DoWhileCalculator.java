package may10;

import java.util.Scanner;

public class DoWhileCalculator {
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
            int option = scanner.nextInt();
            if (option >= 1) {
                System.out.println("Enter first number");
                int a = scanner.nextInt();
                System.out.println("Enter second number");
                int b = scanner.nextInt();
                int c;

                if (option == 1) {
                    c = a + b;
                    System.out.println("Result is: " + c);
                } else if (option == 2) {
                    c = a - b;
                    System.out.println("Result is: " + c);
                } else if (option == 3) {
                    c = a * b;
                    System.out.println("Result is: " + c);
                } else if (option == 4) {
                    c = a / b;
                    System.out.println("Result is: " + c);
                } else if (option == 5) {
                    c = a % b;
                    System.out.println("Result is: " + c);
                }
            }
           else if (option == 0)
                System.exit(0);
            System.out.println("Do you still want to use Calculator, Press 1 for Yes and Press 0 for No ");
            i=scanner.nextInt();
        }
        while (i!=0);
    }
}
