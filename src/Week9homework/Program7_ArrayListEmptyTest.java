package Week9homework;
/**
 * Write a Java program to test if an array list is empty or not.
 */

import java.util.ArrayList;

public class Program7_ArrayListEmptyTest {
    // Method to check if an ArrayList is empty
    public static boolean isArrayListEmpty(ArrayList<Integer> numbers) {
        return numbers.isEmpty(); //  // Returns true if the list is empty, false otherwise


    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        System.out.println("Is the ArrayList empty? " + isArrayListEmpty(numbers));

        // Add some elements to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        // Test again after adding elements
        System.out.println("Is the ArrayList empty? " + isArrayListEmpty(numbers));

    }
}
