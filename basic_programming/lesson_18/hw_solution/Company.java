package company;

import java.util.Arrays;

public class Company {
    public static String companyName;
    private String[] departments;
    private String[] employees;
    private int employeesAmount;
    private String director;

    public Company(String companyName, String[] departments, String[] employees, int employeesAmount, String director) {
        this.companyName = companyName;
        this.departments = departments;
        this.employees = employees;
        this.employeesAmount = employeesAmount;
        this.director = director;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String[] getDepartments() {
        return departments;
    }

    public String[] getEmployees() {
        return employees;
    }

    public int getEmployeesAmount() {
        return employeesAmount;
    }

    public String getDirector() {
        return director;
    }

    public void setDepartments(String[] departments) {
        this.departments = departments;
    }

    public void setEmployees(String[] employees) {
        this.employees = employees;
    }

    public void setEmployeesAmount(int employeesAmount) {
        this.employeesAmount = employeesAmount;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Company{" +
                "companyName='" + companyName + '\'' +
                ", departments=" + Arrays.toString(departments) +
                ", employees=" + Arrays.toString(employees) +
                ", employeesAmount=" + employeesAmount +
                ", director='" + director + '\'' +
                '}';
    }
}