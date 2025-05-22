package may3;

import java.util.Scanner;

public class LeapYear {
    public static void main (String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter an year");
        int x= scanner.nextInt();
        System.out.println("Enter another year");
        int y= scanner.nextInt();
      //  int x=2024;
        // int y=2025;
        if(x%4==0)
        {
            System.out.println(x+" is a leap year");
        }
        else
            System.out.println(x + " is not a leap year");
        if(y%4==0)
        {
            System.out.println(y+" is a leap year");
        }
        else
            System.out.println(y + " is not a leap year");

    }
}
