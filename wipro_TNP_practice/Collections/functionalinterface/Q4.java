package Collections.functionalinterface;
import java.util.ArrayList;
import java.util.function.Predicate;

class Emp {

    private int id;
    private String name;
    private double salary;

    // Parameterized Constructor
    Emp(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class Q4 {

    public static void main(String[] args) {

        ArrayList<Emp> list = new ArrayList<>();

        list.add(new Emp(101, "Sravanthi", 8000));
        list.add(new Emp(102, "Rahul", 15000));
        list.add(new Emp(103, "Anitha", 9000));
        list.add(new Emp(104, "Kiran", 12000));
        list.add(new Emp(105, "Ravi", 7000));

        // Predicate to check salary
        Predicate<Emp> p = emp -> emp.getSalary() < 10000;

        System.out.println("Employees with Salary less than 10000:");

        for (Emp emp : list) {

            if (p.test(emp)) {
                System.out.println(emp.getName());
            }

        }
    }
}