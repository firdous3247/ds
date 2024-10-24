import java.util.Arrays;

public class EmployeeSorter {
	
    public static void sortEmployeesBySalary(Employee[] employees) {
    	
        Arrays.sort(employees);
    }

    public static void main(String[] args) {
    	
        Employee[] employees = {
            new Employee("Alice", 75000),
            new Employee("Bob", 50000),
            new Employee("Charlie", 60000)
        };

        System.out.println("Before sorting:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }

        sortEmployeesBySalary(employees);

        System.out.println("\nAfter sorting by salary:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
