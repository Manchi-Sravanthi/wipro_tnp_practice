package Collections.set;
import java.util.HashSet;
import java.util.Iterator;

public class Q1 {
    HashSet<String> H1 = new HashSet<>();
    public HashSet<String> saveCountryNames(String countryName) {

        H1.add(countryName);

        return H1;
    }
    public String getCountry(String countryName) {

        Iterator<String> itr = H1.iterator();

        while (itr.hasNext()) {

            String country = itr.next();
            if (country.equals(countryName)) {
                return country;
            }

        }

        return null;
    }

    public static void main(String[] args) {

        Q1 obj = new Q1();

        obj.saveCountryNames("India");
        obj.saveCountryNames("USA");
        obj.saveCountryNames("Japan");
        obj.saveCountryNames("Australia");

        System.out.println("Countries : " + obj.H1);

        System.out.println();

        System.out.println("Search India : " + obj.getCountry("India"));

        System.out.println("Search China : " + obj.getCountry("China"));

    }
}

