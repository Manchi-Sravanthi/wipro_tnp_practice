package Collections.map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Q2 {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("India", "Delhi");
        map.put("Japan", "Tokyo");
        map.put("USA", "Washington");
        map.put("Australia", "Canberra");

        if (map.containsKey("India")) {
            System.out.println("Key 'India' exists");
        } else {
            System.out.println("Key not found");
        }

        if (map.containsValue("Tokyo")) {
            System.out.println("Value 'Tokyo' exists");
        } else {
            System.out.println("Value not found");
        }
        System.out.println("\nUsing Iterator:");

        Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();

        while (itr.hasNext()) {

            Map.Entry<String, String> entry = itr.next();

            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
