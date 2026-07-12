package iostreams.serialization;
import java.io.*;
import java.util.Date;

class Employee implements Serializable {

    private String name;
    private Date dateOfBirth;
    private String department;
    private String designation;
    private double salary;
    public Employee() {
    }
    public Employee(String name, Date dateOfBirth, String department,
                    String designation, double salary) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getDepartment() {
        return department;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

public class Q1 {

    public static void main(String[] args) {

        try {
            Employee emp = new Employee(
                    "Sravanthi",
                    new Date(),
                    "AIML",
                    "Software Engineer",
                    75000.0);

            ObjectOutputStream oos =
                    new ObjectOutputStream(new FileOutputStream("data"));

            oos.writeObject(emp);
            oos.close();

            System.out.println("Employee object serialized successfully.");
            ObjectInputStream ois =
                    new ObjectInputStream(new FileInputStream("data"));

            Employee e = (Employee) ois.readObject();

            ois.close();

            // Display Employee Details
            System.out.println("\nEmployee Details");
            System.out.println("----------------------");
            System.out.println("Name        : " + e.getName());
            System.out.println("Date of Birth : " + e.getDateOfBirth());
            System.out.println("Department  : " + e.getDepartment());
            System.out.println("Designation : " + e.getDesignation());
            System.out.println("Salary      : " + e.getSalary());

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}