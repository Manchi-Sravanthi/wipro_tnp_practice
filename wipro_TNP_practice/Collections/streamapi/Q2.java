package Collections.streamapi;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee {

    int empNo;
    String name;
    int age;
    String location;

    // Parameterized Constructor
    Employee(int empNo, String name, int age, String location) {
        this.empNo = empNo;
        this.name = name;
        this.age = age;
        this.location = location;
    }

    // Method to display details
    void display() {
        System.out.println(empNo + " " + name + " " + age + " " + location);
    }
}

public class Q2 {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(101, "Sravanthi", 21, "Hyderabad"));
        list.add(new Employee(102, "Rahul", 24, "Pune"));
        list.add(new Employee(103, "Anitha", 22, "Chennai"));
        list.add(new Employee(104, "Kiran", 25, "Pune"));
        list.add(new Employee(105, "Ravi", 23, "Delhi"));
        List<Employee> puneEmployees = list.stream()
                .filter(emp -> emp.location.equals("Pune"))
                .collect(Collectors.toList());
        System.out.println("Employees from Pune:");

        puneEmployees.forEach(emp -> emp.display());
    }
}