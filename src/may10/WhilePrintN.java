package may10;

import java.util.Scanner;

public class WhilePrintN {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number up to which you want to print");
        int n= scanner.nextInt();
        int x=1;
        while(x<=n)
        {
            System.out.println(x);
            x++;
        }
    }
}
