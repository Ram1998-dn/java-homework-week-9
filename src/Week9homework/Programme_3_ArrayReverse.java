package Week9homework;

import java.util.Arrays;

/**
 * Write a Java program to reverse an array of integer values.
 */
public class Programme_3_ArrayReverse {


    // Method to reverse an array
    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        // Swap elements from start and end moving towards the center
        while (start < end) {
            // Swap elements at indices start and end
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move pointers towards the center
            start++;
            end--;
        }


    }

    public static void main(String[] args) {
        int[] number = {1, 2, 3, 4, 5};

        System.out.println("Original array:");

        for (int num : number) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Call the reverseArray method
        reverseArray(number);
        System.out.println("Reversed array:");
        for (int num : number) {
            System.out.print(num + " ");
        }
    }
}
