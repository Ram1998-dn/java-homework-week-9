package Week9homework;

import java.util.ArrayList;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */
public class Program6_RetrieveElement {
    public static void main(String[] args) {
        // Create a new ArrayList to hold Integer values
        ArrayList<Integer> numbers = new ArrayList<>();
        // Add some numbers to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Specify an index to retrieve an element
        int index = 2;  // For example, we want to retrieve the element at index 2

        // Call the method to get the element at the specified index
        Integer element = getElementAtIndex(numbers, index);

        // If the element is not null, print it
        if (element != null) {
            System.out.println("Element at index " + index + ": " + element);
        }

    }
    // Method to retrieve an element at a specified index from the ArrayList
    public static Integer getElementAtIndex(ArrayList<Integer> numbers, int index){
        // Check if the index is within bounds of the ArrayList
        if (index >= 0 && index < numbers.size()) {
            return numbers.get(index);  // Retrieve the element at the specified index
        } else {
            System.out.println("Index out of bounds");
            return null;  // Return null if index is out of bounds
        }
    }
}
