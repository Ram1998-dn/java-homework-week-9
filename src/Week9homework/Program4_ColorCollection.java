package Week9homework;

import java.util.ArrayList;

/**
 *
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */

public class Program4_ColorCollection {
    public static void main(String[] args) {
        // Create a new ArrayList to hold color strings
        ArrayList<String> colors = new ArrayList<>();
        // Call method to add colors
        addColor(colors);
        // Call method to print colors
        printColor(colors);
    }
    // Method to add colors to the ArrayList
    public static void addColor(ArrayList<String> colors) {
        // Adding colors to the ArrayList
        colors.add("White");
        colors.add("Green");
        colors.add("Black");
        colors.add("Yellow");
        colors.add("Blue");
        colors.add("Orange");
    }

    public static void printColor(ArrayList<String> colors) {
        // Method to print colors using a for-each loop
        System.out.println("Color in the collection : ");
        for (String color : colors) {
            System.out.println(color);
        }
    }


}
