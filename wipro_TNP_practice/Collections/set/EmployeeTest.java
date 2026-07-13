package Collections.set;
public class EmployeeTest {

    public static void main(String[] args) {

        EmployeeDB db = new EmployeeDB();

        db.addEmployee(new Employee(103, "Rahul",
                "rahul@gmail.com", "Male", 45000));

        db.addEmployee(new Employee(101, "Sravanthi",
                "sravanthi@gmail.com", "Female", 50000));

        db.addEmployee(new Employee(102, "Kiran",
                "kiran@gmail.com", "Male", 55000));

        System.out.println("Employees");

        db.displayEmployees();

        System.out.println();

        System.out.println(db.showPaySlip(102));

        System.out.println();

        db.deleteEmployee(101);

        System.out.println("After Deletion");

        db.displayEmployees();

    }

}
