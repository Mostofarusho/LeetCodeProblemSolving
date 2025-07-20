import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        // Step 1: Create a Hashtable
        Hashtable<String, Integer> marks = new Hashtable<>();

        // Step 2: Put key-value pairs
        marks.put("Rahim", 85);
        marks.put("Karim", 92);
        marks.put("Sadia", 78);

        // Step 3: Get a value by key
        int rahimMarks = marks.get("Rahim");
        System.out.println("Rahim's Marks: " + rahimMarks);

        // Step 4: Iterate through keys and values
        for (String name : marks.keySet()) {
            int score = marks.get(name);
            System.out.println(name + " => " + score);
        }
    }
}
