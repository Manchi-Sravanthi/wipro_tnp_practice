package Collections.list.ll;
public class EmployeeTest {

    public static void main(String[] args) {

        EmployeeDB db = new EmployeeDB();

        Employee e1 = new Employee(101, "Sravanthi",
                "sravanthi@gmail.com", "Female", 50000);

        Employee e2 = new Employee(102, "Rahul",
                "rahul@gmail.com", "Male", 45000);

        db.addEmployee(e1);
        db.addEmployee(e2);

        System.out.println("All Employees");
        db.displayEmployees();

        System.out.println(db.showPaySlip(101));

        System.out.println();

        db.deleteEmployee(102);

        System.out.println("After Deletion");
        db.displayEmployees();
    }
}
