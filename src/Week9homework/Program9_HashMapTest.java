package Week9homework;

import java.util.HashMap;
import java.util.Map;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class Program9_HashMapTest {
    public static void main(String[] args) {

        HashMap<String,Integer> set = new HashMap<>();

        set.put("Dipti",10);
        set.put("Rishi",11);
        set.put("Nirav",12);
        set.put("Deep",13);

        System.out.println("People in the HashMap: ");
        for (Map.Entry<String,Integer> values: set.entrySet()){
            String name = values.getKey();    // Get the key (name)
            Integer age = values.getValue();  // Get the value (age)
            System.out.println(name + ": " + age);

        }
    }
}
