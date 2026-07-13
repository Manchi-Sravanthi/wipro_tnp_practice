package Collections.list.q7;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

    public static void main(String[] args) {

        Vector<Employee> list = new Vector<>();

        list.add(new Employee(101, "Sravanthi",
                "sravanthi@gmail.com", "Female", 50000));

        list.add(new Employee(102, "Rahul",
                "rahul@gmail.com", "Male", 45000));

        list.add(new Employee(103, "Kiran",
                "kiran@gmail.com", "Male", 60000));

        System.out.println("Using Iterator");

        Iterator<Employee> itr = list.iterator();

        while (itr.hasNext()) {

            Employee e = itr.next();

            e.getEmployeeDetails();

            System.out.println("----------------------");
        }

        System.out.println("\nUsing Enumeration");

        Enumeration<Employee> en = list.elements();

        while (en.hasMoreElements()) {

            Employee e = en.nextElement();

            e.getEmployeeDetails();

            System.out.println("----------------------");
        }

    }

}
