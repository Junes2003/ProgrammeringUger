package Uge9.Employee;

public class Employee {
    private String employeeld;
    private String employeeName;
    private double employeeSalary;

    public String getEmployeeld() {
        return employeeld;
    }

    public void setEmployeeld(String employeeld) {
        this.employeeld = employeeld;
    }

    public String getEmployeeName() {
        return employeeName;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getemployeeSalary() {
        return employeeSalary;
    }

    public void setemployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    public String getFormattedSalary(){
        return String.format("%.2f", employeeSalary);
    }
}
