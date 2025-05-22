package may3;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the value for x");
        int x= scanner.nextInt();
        System.out.println("Enter the value for y");
        int y= scanner.nextInt();

        if(x%2==0)
        System.out.println(x+" is Even number");
        else
            System.out.println(x+" is Odd Number");

        if(y%2!=0)
            System.out.println(y+" is Odd number");
        else
            System.out.println(y+" is Even Number");
    }
}
