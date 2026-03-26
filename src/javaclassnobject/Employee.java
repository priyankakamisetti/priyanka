package javaclassnobject;

public class Employee {
	    String name;
	    int employeeId;
	    double salary;

	    Employee(String name, int employeeId, double salary) {
	        this.name = name;
	        this.employeeId = employeeId;
	        this.salary = salary;
	    }
	    void displayInfo() {
	        System.out.println("Employee Name: " + name);
	        System.out.println("Employee ID: " + employeeId);
	        System.out.println("Salary: " + salary);
	        System.out.println("---------------------------");
	    }
}
