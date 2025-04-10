package Uge9.Employee;

public class MainEmployee {
    public static void main(String[] args) {
    Employee employee = new Employee();

    employee.setEmployeeld("AAAA");
    employee.setEmployeeName("Dudas Jensen");
    employee.setemployeeSalary(15000.0000067678);

        System.out.println(" Employee ID: " + employee.getEmployeeld());
        System.out.println(" Empoyee Name: " + employee.getEmployeeName());
        System.out.println(" Employee Salary: " + employee.getemployeeSalary());

        System.out.println(employee.getFormattedSalary());
    }
}
