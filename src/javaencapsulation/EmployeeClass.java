package javaencapsulation;

public class EmployeeClass {
	
	 private String name;
	    private int employeeId;
	    private int salary;

	    // Getter methods
	    public String getName() {
	        return name;
	    }

	    public int getEmployeeId() {
	        return employeeId;
	    }

	    public int getSalary() {
	        return salary;
	    }

	    // Setter methods
	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setEmployeeId(int employeeId) {
	        this.employeeId = employeeId;
	    }

	    public void setSalary(int salary) {
	        if (salary >= 0 && salary <= 100) {
	            this.salary = salary;
	        } else {
	            System.out.println("error in salary");
	        }
	    }

	    
}