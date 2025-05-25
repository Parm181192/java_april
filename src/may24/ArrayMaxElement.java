package may24;

import java.util.Scanner;

public class ArrayMaxElement {
    public static void main(String[] args) {
     /*   int[] arr = {10,20,30,40,80,60,70};
        //int[6] arr = {10,20,30,40,80,60,70}; //Gives error
        int smallest =arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if (smallest <arr[i])
             smallest =arr[i];
        }
        System.out.println("Biggest Number is: "+ smallest);
    */
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[6];
        System.out.println("enter numbers");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        ArrayMaxElement AElement = new ArrayMaxElement();
        AElement.largest(arr);

    }

    public void largest(int arr[]) {
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (largest < arr[i])
                largest = arr[i];
        }
        System.out.println("Biggest Number is: " + largest);

    }
}
