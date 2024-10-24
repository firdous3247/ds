
public class EmployeeArr {
	
	private static void searchBySalary(Employee[] employees, double sal) {
		
		for(Employee emp : employees) {
			
			if(emp.salary == sal) {
				
				System.out.println("Found: " + emp);
				return;
			}
		}
		System.out.println("Employee with salary " + sal + " not found.");
	}

	private static void searchByName(Employee[] employees, String string) {
		
		for(Employee emp : employees) {
			
			if(emp.name.equalsIgnoreCase(string)) {
				
				System.out.println("Found: " + emp);
				return;
			}
		}
		
		System.out.println("Employee with name " + string + " not found.");
	}

	private static void searchByEmpId(Employee[] employees, int id) {
	
		for(Employee emp : employees) {
			
			if(emp.empid == id) {
				
				System.out.println("Found: " + emp);
				return;
			}
		}
		
		System.out.println("Employee with ID " + id + " not found.");
	}

	public static void main(String[] args) {
		
		Employee[] employees = new Employee[5];

		employees[0] = new Employee(101, "John Doe", 50000);
        employees[1] = new Employee(102, "Jane Smith", 60000);
        employees[2] = new Employee(103, "David Lee", 45000);
        employees[3] = new Employee(104, "Alice Brown", 75000);
        employees[4] = new Employee(105, "Bob Johnson", 40000);
        
        searchByEmpId(employees, 102);
        searchByName(employees, "Alice Brown");
        searchBySalary(employees, 45000);
	}
}
