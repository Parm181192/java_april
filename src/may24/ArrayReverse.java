package may24;

import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
    //    int[] arr = {1, 2, 3, 4, 5, 6};
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];

        System.out.println("Enter array elements");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] =scanner.nextInt();
        }

        ArrayReverse.ReverseArray(arr);
        System.out.println("Print all the elements of array in reverse order");
        for(int i = 0; i < arr.length; i ++)
        {
            System.out.println(arr[i]);
        }
    }

    public static void ReverseArray(int[] arr) {
        int temp;
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

