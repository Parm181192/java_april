package may6;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in) ;
        System.out.println("Enter the character you want to know if it is vowel or consonant");
        char input = scanner.next().charAt(0);
        switch (input)
        {
            case 'a':
                System.out.println("a is a vowel");
                break;
            case 'e':
                System.out.println("e is a vowel");
                break;
            case 'i':
                System.out.println("i is a vowel");
                break;
            case 'o':
                System.out.println("o is a vowel");
                break;
                case 'u':
                System.out.println("u is a vowel");
                break;
            default:
                System.out.println(input+" is a consonant");
        }
    }
}
