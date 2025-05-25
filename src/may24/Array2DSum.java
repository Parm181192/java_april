package may24;

import java.util.Scanner;

public class Array2DSum {
    public static void main(String[] args) {
        int[][] arr1 = new int[3][3];
        int[][] arr2 = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first array values");
        for(int i = 0; i< arr1.length; i++)
        {
            for (int j = 0; j<arr1.length; j++)
            {
                arr1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter second array values");
        for(int i = 0; i< arr2.length; i++)
        {
            for (int j = 0; j<arr2.length; j++)
            {
                arr2[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Sum of 2 arrays is: ");
        Array2DSum.Sum(arr1, arr2);

    }
    public static void Sum(int[][] arr1, int [][] arr2)
    {
        int [][] arr3 = new int[3][3];
        int temp;
        for(int i = 0; i< arr3.length; i++)
        {
            for (int j = 0; j<arr3.length; j++)
            {
                arr3[i][j] = arr1[i][j]+arr2[i][j];
                System.out.println(arr3[i][j]);
            }
        }
    }


}

