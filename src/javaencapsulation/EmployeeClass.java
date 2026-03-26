package javaencapsulation;

public class EmployeeClass {
	
	    private String name;
	    private int employeeId;
	    private double salary;
	   

     EmployeeClass(String name, int employeeId, double salary) {
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
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getEmployeeId() {
			return employeeId;
		}
		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		
	
		}
	    
	   
	    
}


