package may6;

import java.util.Scanner;

public class IVR {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);

        System.out.println("************IVR********");
        System.out.println("Press 1 for English");
        System.out.println("Press 2 for French");
        int input=scanner.nextInt();
        if(input==1)
        {
            System.out.println("Welcome to our company services:");
            System.out.println ("Press 1 for Tech Support services");
            System.out.println("Press 2 for Billing services");
            System.out.println("Press 3 for Payment services ");
            System.out.println("Press 4 for Sales");
            int option=scanner.nextInt();
            switch(option) {
                case 1:
                    System.out.println("Welcome to Tech Support services");
                    break;
                case 2:
                    System.out.println("Welcome to Billing services");
                    break;
                case 3:
                    System.out.println("Welcome to Payment services");
                    break;
                case 4:
                    System.out.println("Welcome to Sales");
                    break;
                case 5:
                    System.out.println("Invalid option");
                    break;
            }
        }
        else if(input==2) {
            System.out.println("Welcome to our company services:" +
                    "Press 1 for Tech Support services" +
                    "Press 2 for Billing services" +
                    "Press 3 for Payment services" +
                    "Press 4 for Sales");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Welcome to Tech Support service");
                    break;
                case 2:
                    System.out.println("Welcome to Billing service");
                    break;
                case 3:
                    System.out.println("Welcome to Payment services");
                    break;
                case 4:
                    System.out.println("Welcome to Sales");
                    break;
                case 5:
                    System.out.println("Invalid option");
                    break;
            }
        }
        else
        {
            System.out.println("Invalid option");
        }

    }
}
