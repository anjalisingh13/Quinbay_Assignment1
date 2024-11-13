package Question3;
import java.time.LocalDate;
import java.util.Date;

public class TestEmployee {
    public static void main(String[] args) {
        // Create a list of employees
        MyList<Employee> employeeList = new MyList<>();

        // Add Employee objects with LocalDate instead of deprecated Date
        employeeList.add(new Employee("E001", "Alice", 28, LocalDate.of(2020, 1, 1))); // Jan 1, 2020
        employeeList.add(new Employee("E002", "Bob", 34, LocalDate.of(2018, 6, 10))); // Jun 10, 2018
        employeeList.add(new Employee("E003", "Charlie", 25, LocalDate.of(2022, 3, 15))); // Mar 15, 2022

        // Display all employees
        System.out.println("All Employees:");
        for (int i = 0; i < employeeList.getSize(); i++) {
            System.out.println(employeeList.get(i));
        }

        // Delete the employee at index 1
        System.out.println("\nAfter deleting employee at index 1:");
        employeeList.deleteAtIndex(1);
        for (int i = 0; i < employeeList.getSize(); i++) {
            System.out.println(employeeList.get(i));
        }

        // Delete employee with ID "E003"
        System.out.println("\nAfter deleting employee with ID E003:");
        employeeList.deleteByValue(new Employee("E003", "Charlie", 25, LocalDate.of(2022, 3, 15)));
        for (int i = 0; i < employeeList.getSize(); i++) {
            System.out.println(employeeList.get(i));
        }
    }
}
