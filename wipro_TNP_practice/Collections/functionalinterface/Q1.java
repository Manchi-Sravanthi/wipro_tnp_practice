package Collections.functionalinterface;
import java.util.ArrayList;
import java.util.function.Function;

class Employee {

    int id;
    String name;
    String location;
    double salary;

    Employee(int id, String name, String location, double salary) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.salary = salary;
    }
}

public class Q1 {

    public static void main(String[] args) {

        ArrayList<Employee> empList = new ArrayList<>();

        empList.add(new Employee(101, "Sravanthi", "Hyderabad", 50000));
        empList.add(new Employee(102, "Rahul", "Pune", 45000));
        empList.add(new Employee(103, "Anitha", "Chennai", 40000));
        empList.add(new Employee(104, "Kiran", "Delhi", 55000));
        empList.add(new Employee(105, "Ravi", "Mumbai", 48000));
        Function<Employee, String> f = emp -> emp.location;

        ArrayList<String> locations = new ArrayList<>();

        for (Employee e : empList) {
            locations.add(f.apply(e));
        }

        System.out.println("Locations:");
        System.out.println(locations);
    }
}