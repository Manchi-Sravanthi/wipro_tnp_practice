package Collections.list.ll;
import java.util.LinkedList;

public class EmployeeDB {

    LinkedList<Employee> list = new LinkedList<>();
    public boolean addEmployee(Employee e) {
        return list.add(e);
    }
    public boolean deleteEmployee(int empId) {

        for (Employee e : list) {

            if (e.getEmpId() == empId) {
                list.remove(e);
                return true;
            }

        }

        return false;
    }
    public String showPaySlip(int empId) {

        for (Employee e : list) {

            if (e.getEmpId() == empId) {
                return "Pay Slip\nEmployee ID : " + e.getEmpId()
                        + "\nEmployee Name : " + e.getEmpName()
                        + "\nSalary : " + e.getSalary();
            }

        }

        return "Employee Not Found";
    }
    public void displayEmployees() {

        for (Employee e : list) {
            e.getEmployeeDetails();
            System.out.println("----------------------");
        }

    }

}
