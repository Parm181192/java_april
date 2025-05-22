package may10;

import java.util.Scanner;

public class ForTable {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number for which you want multiplication");
        int number = scanner.nextInt();
        for(int x=1;x<=10;x++)
        {
            System.out.println(number+"*"+x+"="+(number*x));
        }


    }
}
