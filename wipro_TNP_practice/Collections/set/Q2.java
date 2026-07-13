package Collections.set;
import java.util.HashSet;
import java.util.Iterator;
public class Q2 {
	public static void main(String[] args) {
		HashSet<String>set=new HashSet<>();
		set.add("Sravanthi");
		set.add("Aparna");
		set.add("Meghana");
		set.add("Sravanthi");
		Iterator<String>itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
