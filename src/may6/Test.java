package may6;

import java.util.Scanner;

public class Test {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        int input= scanner.nextInt();

        switch (input){
            case 1:
                System.out.println("Switch on the fan");
                break;
            case 2:
                System.out.println("Switch on the bulb1");
                break;
            case 3:
                System.out.println("Switch on the bulb2");
                break;
        }


    }
}
