package Week9homework;
/**
 *
 * Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */

import java.util.HashSet;

public class Program8_HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet to store Integer objects
        HashSet <Integer> numberset = new HashSet<>();
        // Adding numbers to the HashSet
        numberset.add(4);
        numberset.add(7);
        numberset.add(8);

        // Loop through numbers from 1 to 10 and check if they are in the set
        for (int i = 1; i <=10 ; i++) {

            if (numberset.contains(i)){
                System.out.println(i + " is in the set.");
            }else {
                System.out.println(i+ " is in not set.");
            }
        }
    }
}
