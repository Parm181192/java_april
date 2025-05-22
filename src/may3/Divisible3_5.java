package may3;

public class Divisible3_5 {
    public static void main(String[] args){
        int x=20;
        if((x%3)==0 && ((x%5)==0))
        {
            System.out.println("Number is divisible by 3 and 5");
        }
        if((x%3)!=0 && (x%5)!=0)
        {
            System.out.println("Number is not divisible by 3 and 5");
        }
        if((x%3)==0 && (x%5)!=0)
        {
            System.out.println("Number is divisible by 3");
        }
        if((x%3)!=0 && ((x%5)==0))
        {
            System.out.println("Number is divisible by 5");
        }
    }


}
