package may24;

public class TwoDArray {

    public static void main(String[] args) {
        int [] [] arr = new int[3][3];

        arr[0][0] = 10;
        arr[0][1] = 20;
        arr[0][2] = 30;
        arr[1][0] = 50;
        arr[1][1] = 60;
        arr[1][2] = 70;
        arr[2][0] = 90;
        arr[2][1] = 100;
        arr[2][2] = 110;

        for (int i = 0; i< arr.length;i++)
        {
            for (int j = 0; j <arr.length;j++)
            {
                System.out.println(arr[i][j]);
            }
        }

    }
}
