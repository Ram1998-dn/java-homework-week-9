package Week9homework;
/**
 * Write a programme that tells you which line passes through particular stations.
 * Just use Zone 1 stations name.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Program10_TubeLineFinder {
    public static void main(String[] args) {
        // Create a HashMap to store Zone 1 stations and their lines
        HashMap<String, List<String>> stationLinesMap = new HashMap<>();

        // Populate the map with some Zone 1 stations and their corresponding lines
        stationLinesMap.put("Baker Street", List.of("Bakerloo", "Circle", "Hammersmith & City", "Jubilee", "Metropolitan"));
        stationLinesMap.put("Oxford Circus", List.of("Bakerloo", "Central", "Victoria"));
        stationLinesMap.put("Victoria", List.of("Victoria", "Circle", "District"));
        stationLinesMap.put("Liverpool Street", List.of("Central", "Circle", "Hammersmith & City", "Metropolitan"));
        stationLinesMap.put("King's Cross St Pancras", List.of("Circle", "Hammersmith & City", "Metropolitan", "Northern", "Piccadilly", "Victoria"));
        stationLinesMap.put("Waterloo", List.of("Bakerloo", "Jubilee", "Northern", "Waterloo & City"));
        stationLinesMap.put("Green Park", List.of("Jubilee", "Piccadilly", "Victoria"));
        stationLinesMap.put("Piccadilly Circus", List.of("Bakerloo", "Piccadilly"));
        stationLinesMap.put("Leicester Square", List.of("Northern", "Piccadilly"));
        stationLinesMap.put("Embankment", List.of("Bakerloo", "Circle", "District", "Northern"));

        // Create a scanner to take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Zone 1 station name to find the lines passing through it: ");
        String station = scanner.nextLine().trim();

        // Check if the station is in the map and display the lines
        if (stationLinesMap.containsKey(station)) {
            List<String> lines = stationLinesMap.get(station);
            System.out.println("The lines that pass through " + station + " are: " + lines);
        } else {
            System.out.println("Station not found in Zone 1 or not in our data.");
        }

        scanner.close();
    }
}
