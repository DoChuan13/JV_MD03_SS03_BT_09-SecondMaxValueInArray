package Max2InArray;

import java.util.Scanner;

public class MaxInArrayAd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        do {
            System.out.print("Input Array length: ");
            size = input.nextInt();
            if (size > 20 || size <= 0) {
                System.out.println("Array size too long, or invalid, please try again.");
            }
        } while (size > 20 || size <= 0);

        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Input element at %d: ", (i + 1));
            arr[i] = input.nextInt();
        }
        System.out.printf("\n%-20s%s", "Current Array is: ", "");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        int max = arr[0], second = arr[1];
        int index = 1, indexSecond = 2;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                second = max;
                max = arr[i];
                indexSecond = index;
                index = i + 1;
            }
        }
        System.out.printf("\nThe first max element in Array is %d, at position %d\n", max, index);
        System.out.printf("The second max element in Array is %d, at position %d", second, indexSecond);
    }
}
