package may3;

public class GameScore {
    public static void main(String[] args)
    {
        int userScore=120;
        int maxScore=200;
        float percentage=(float)(userScore*100.0f)/maxScore;
        System.out.println("User's percentage is: "+ percentage);
    }
}
