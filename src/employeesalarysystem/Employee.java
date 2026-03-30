package employeesalarysystem;

public class Employee {
	//parent
	
	private String Name;
	private double BaseSalary;
	//get method
	public String getName() {
	return Name;
}

public double getBaseSalary() {
	return BaseSalary;
}
	
// Method to calculate salary 
public double calculateSalary() {
    return BaseSalary;
}
}

//Subclass: FullTimeEmployee
class FullTimeEmployee extends Employee {
public double calculateSalary() {
    // Example: Full-time employees get 20% bonus
    return getBaseSalary() + (getBaseSalary() * 0.20);
}
}

//Subclass: Intern
class Intern extends Employee {
public double calculateSalary() {
    // Example: Interns get only base salary (or reduced)
    return getBaseSalary() * 0.50;
}
}
	
	
	
	
	
	
	
	
	
	
	
	
	


