package Collections.map;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Q3 {

    public static void main(String[] args) {

        Properties p = new Properties();
        p.setProperty("Andhra Pradesh", "Amaravati");
        p.setProperty("Telangana", "Hyderabad");
        p.setProperty("Karnataka", "Bengaluru");
        p.setProperty("Tamil Nadu", "Chennai");
        p.setProperty("Kerala", "Thiruvananthapuram");
        Set<Object> keys = p.keySet();
        Iterator<Object> itr = keys.iterator();

        System.out.println("States and Capitals:");

        while (itr.hasNext()) {

            String state = (String) itr.next();

            System.out.println(state + " -> " + p.getProperty(state));
        }

    }

}
