package may10;
import java.util.Scanner;

public class WhileSumN {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the limit up to which you want the sum");
        int n=scanner.nextInt();
        int x=1;
        int sum=0;
        while(x<=n)
        {
            sum=sum+x;
           x++;

        }
        System.out.println(sum);

    }
}
