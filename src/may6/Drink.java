package may6;

import java.util.Scanner;

public class Drink {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("What would you like to have ? Press 1 for Tea, Press 2 for Coffee, Press 3 for Juice");
        int input=scanner.nextInt();
        switch (input){
            case 1:
                System.out.println("You chose Tea");
                break;
            case 2:
                System.out.println("You chose Coffee");
                break;
            case 3:
                System.out.println("You chose Juice");
                break;
            default:
                System.out.println("You didn't chose anything");
        }
    }
}


