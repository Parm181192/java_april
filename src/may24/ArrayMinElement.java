package may24;

import java.util.Scanner;

public class ArrayMinElement {
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
        System.out.println("Enter numbers");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        ArrayMinElement AElement = new ArrayMinElement();
        AElement.smallest(arr);

    }

    public void smallest(int arr[]) {
        int smallest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (smallest > arr[i])
                smallest = arr[i];
        }
        System.out.println("Smallest Number is: " + smallest);

    }
}
