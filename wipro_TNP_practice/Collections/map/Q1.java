package Collections.map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Q1 {
    HashMap<String, String> M1 = new HashMap<>();
    public HashMap<String, String> saveCountryCapital(String countryName, String capital) {

        M1.put(countryName, capital);

        return M1;
    }


    public String getCapital(String countryName) {

        return M1.get(countryName);
    }
    public String getCountry(String capitalName) {

        for (Map.Entry<String, String> entry : M1.entrySet()) {

            if (entry.getValue().equals(capitalName)) {
                return entry.getKey();
            }
        }

        return null;
    }
    public HashMap<String, String> reverseMap() {

        HashMap<String, String> M2 = new HashMap<>();

        for (Map.Entry<String, String> entry : M1.entrySet()) {

            M2.put(entry.getValue(), entry.getKey());

        }

        return M2;
    }
    public ArrayList<String> getCountryList() {

        ArrayList<String> list = new ArrayList<>();

        for (String country : M1.keySet()) {

            list.add(country);

        }

        return list;
    }


    public static void main(String[] args) {

        Q1 obj = new Q1();

        obj.saveCountryCapital("India", "Delhi");
        obj.saveCountryCapital("Japan", "Tokyo");
        obj.saveCountryCapital("USA", "Washington");
        obj.saveCountryCapital("Australia", "Canberra");

        System.out.println("M1 Map");
        System.out.println(obj.M1);

        System.out.println();

        System.out.println("Capital of India : " +
                obj.getCapital("India"));

        System.out.println("Country of Tokyo : " +
                obj.getCountry("Tokyo"));

        System.out.println();

        System.out.println("Reverse Map (M2)");
        System.out.println(obj.reverseMap());

        System.out.println();

        System.out.println("Country List");
        System.out.println(obj.getCountryList());

    }

}