package may10;

import java.util.Scanner;

public class WhileTable {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number for which you want multiplication");
        int number = scanner.nextInt();
        int x=1;
        while(x<=10)
        {

            System.out.println(number+"*"+x+"="+(number*x));
            x++;
        }


    }
}
