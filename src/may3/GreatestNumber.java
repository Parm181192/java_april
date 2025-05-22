package may3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args)
    {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the value for x");
        int x= scanner.nextInt();
        System.out.println("Enter the value for y");
        int y= scanner.nextInt();
        System.out.println("Enter the value for z");
        int z= scanner.nextInt();
        if((x>y)&&(x>z))
        {
            System.out.println(x+" is greatest");
        }
        if((y>x)&&(y>z))
        {
            System.out.println(y+" is greatest");
        }
        if((z>x)&&(z>y))
        {
            System.out.println(z+" is greatest");
      ;  }
        if((x==y)&&(y==z))
        {
            System.out.println("All numbers are same");
        }
    }
}
