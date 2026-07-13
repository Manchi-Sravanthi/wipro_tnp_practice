package Collections.map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Q4 {

    public static void main(String[] args) {

        HashMap<String, Integer> contacts = new HashMap<>();
        contacts.put("Sravanthi", 987654321);
        contacts.put("Rahul", 987654322);
        contacts.put("Kiran", 987654323);
        contacts.put("Anitha", 987654324);
        if (contacts.containsKey("Rahul")) {
            System.out.println("Contact 'Rahul' exists");
        } else {
            System.out.println("Contact not found");
        }
        if (contacts.containsValue(987654323)) {
            System.out.println("Phone Number exists");
        } else {
            System.out.println("Phone Number not found");
        }
        System.out.println("\nContact List:");

        Iterator<Map.Entry<String, Integer>> itr =
                contacts.entrySet().iterator();

        while (itr.hasNext()) {

            Map.Entry<String, Integer> entry = itr.next();

            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
