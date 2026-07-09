package oops.inheritance;

class Person
{
    private String name;

    // Constructor
    public Person(String name)
    {
        this.name = name;
    }

    // Getter
    public String getName()
    {
        return name;
    }

    // Setter
    public void setName(String name)
    {
        this.name = name;
    }
}


class Employee extends Person
{
    private double annualSalary;
    private int yearStarted;
    private String insuranceNumber;

    // Constructor
    public Employee(String name, double annualSalary, int yearStarted, String insuranceNumber)
    {
        super(name);
        this.annualSalary = annualSalary;
        this.yearStarted = yearStarted;
        this.insuranceNumber = insuranceNumber;
    }

    // Getters
    public double getAnnualSalary()
    {
        return annualSalary;
    }

    public int getYearStarted()
    {
        return yearStarted;
    }

    public String getInsuranceNumber()
    {
        return insuranceNumber;
    }

    // Setters
    public void setAnnualSalary(double annualSalary)
    {
        this.annualSalary = annualSalary;
    }

    public void setYearStarted(int yearStarted)
    {
        this.yearStarted = yearStarted;
    }

    public void setInsuranceNumber(String insuranceNumber)
    {
        this.insuranceNumber = insuranceNumber;
    }
}


public class Main
{
    public static void main(String[] args)
    {
        Employee emp = new Employee(
                "Sravanthi",
                600000,
                2024,
                "NI12345"
        );

        System.out.println("Employee Name : " + emp.getName());
        System.out.println("Annual Salary : " + emp.getAnnualSalary());
        System.out.println("Year Started : " + emp.getYearStarted());
        System.out.println("National Insurance Number : " + emp.getInsuranceNumber());

        // Testing setters
        emp.setAnnualSalary(700000);

        System.out.println("Updated Salary : " + emp.getAnnualSalary());
    }
}