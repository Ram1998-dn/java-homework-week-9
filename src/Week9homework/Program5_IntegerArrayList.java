package Week9homework;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */
public class Program5_IntegerArrayList {

    // Method to add integers to the ArrayList
    public static void addNumbers(ArrayList<Integer> numbers) {
        // Adding integers to the ArrayList
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
    }
    // Method to iterate through the ArrayList using an Iterator
    public static void iterateUsingIterator(ArrayList<Integer> numbers) {
        Iterator<Integer> iterator = numbers.iterator();  // Create an Iterator for the ArrayList

        System.out.println("Iterating through ArrayList using Iterator:");

        // Iterate through the list
        while (iterator.hasNext()) {
            Integer number = iterator.next();  // Get the next element in the list
            System.out.println(number);  // Print the element
        }
    }
    public static void main(String[] args) {
        ArrayList <Integer> numbers = new ArrayList<>();
        addNumbers(numbers);
        iterateUsingIterator(numbers);
    }
}
