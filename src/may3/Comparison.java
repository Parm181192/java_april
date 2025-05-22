package may3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Comparison {

    public static void main(String[] args)
    {
     //  int x=10;
       //int y=20;
       //int a=15;
       //int b=25;
    /*   System.out.println(x<y);
       System.out.println(x>y);
       System.out.println(x<a);
       System.out.println(b<y);
       System.out.println(x<=y);
       System.out.println(a>=y);
       System.out.println(x!=b);
       System.out.println(x==y);
       System.out.println(a==y);
       System.out.println(x==y);
*/
       Scanner scanner=new Scanner(System.in);
       System.out.println("Enter the value for x");
       int x=scanner.nextInt();
       System.out.println("Enter the value for y");
       int y=scanner.nextInt();
       System.out.println("Enter the value for a");
       int a=scanner.nextInt();
       System.out.println("Enter the value for b");
       int b=scanner.nextInt();
       boolean result1=!((x<=y)||(x>b));
       System.out.println(result1);
       boolean result2= ((x>y)&& (a>348));
       System.out.println(result2);
       boolean result3=!((x>=y)||(x>a));
       System.out.println(result3);
       boolean result4=((x>y)&& (a>18));
       System.out.println(result4);
       boolean result5=!((a>=y)||(x>8));
       System.out.println(result5);
       boolean result6=!((x>y)||(x>23));
       System.out.println(result6);
       boolean result7=((b>y)&&(x>8));
       System.out.println(result7);
       boolean result8=((x>=y)||(x<=10));
       System.out.println(result8);
       boolean result9=((x>y)&&(x>a));
       System.out.println(result9);
       boolean result10=!((x==y)||(x<=8));
       System.out.println(result10);

    }
}
