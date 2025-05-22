package may10;

import java.util.Scanner;

public class ForPrintN {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number up to which you want to print");
        int n= scanner.nextInt();
        for(int x=1;x<=n;x++)
        {
            System.out.println(x);
        }
    }
}
