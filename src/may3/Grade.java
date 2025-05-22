package may3;

public class Grade {
    public static void main(String[] args)
    {
        float marks=98.0f;
        if(marks>=90.0f)
        {
            System.out.println("Grade A");
        }
        if((marks>=80.0f)&&(marks<90.0f))
        {
            System.out.println("Grade B");
        }
        if((marks>=70.0f)&&(marks<80.0f))
        {
            System.out.println("Grade C");
        }
        if((marks<=70.0f))
        {
            System.out.println("Grade D");
        }

    }
}
