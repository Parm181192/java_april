package may10;
import java.util.Scanner;

public class ForSumN {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the limit up to which you want the sum");
        int n=scanner.nextInt();
        int sum=0;
       for( int x=1; x<=n;x++)
        {
            sum=sum+x;
        }
        System.out.println("Sum is"+sum);

    }
}
