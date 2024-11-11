package Week9homework;
import java.util.ArrayList;

/**
 * Declare following two arrylist and compare it.
 * ArrayList<String> c1= new ArrayList<String>();
 * c1.add("Red");
 * c1.add("Green");
 * c1.add("Black");
 * c1.add("White");
 * c1.add("Pink");
 * ArrayList<String> c2= new ArrayList<String>();
 * c2.add("Red");
 * c2.add("Green");
 * c2.add("Black");
 * c2.add("Pink");
 */
public class Program11_ArrayListComparison {
    public static void main(String[] args) {
        // Declare and initialize two ArrayLists
        ArrayList<String> c1 = new ArrayList<>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");

        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Red");
        c2.add("Green");
        c2.add("Black");
        c2.add("Pink");

        // 1. Direct Comparison
        boolean areEqual = c1.equals(c2);
        System.out.println("Are both ArrayLists equal? " + areEqual);

        // 2. Finding Common Elements
        ArrayList<String> commonElements = new ArrayList<>(c1);
        commonElements.retainAll(c2);
        System.out.println("Common elements in c1 and c2: " + commonElements);

        // 3. Finding Elements in c1 not in c2
        ArrayList<String> uniqueInC1 = new ArrayList<>(c1);
        uniqueInC1.removeAll(c2);
        System.out.println("Elements in c1 but not in c2: " + uniqueInC1);

        // 4. Finding Elements in c2 not in c1
        ArrayList<String> uniqueInC2 = new ArrayList<>(c2);
        uniqueInC2.removeAll(c1);
        System.out.println("Elements in c2 but not in c1: " + uniqueInC2);
    }
}
