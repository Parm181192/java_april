package may10;

import java.util.Scanner;

public class ForFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number for which you want to calculate factorial");
        int num = scanner.nextInt();
        int fact = 1;

        for (int i = num; i > 1; i--) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}