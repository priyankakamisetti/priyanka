package employeesalarysystem;

 class Employee {
	
	private String name;
	private int baseSalary;
	//get method
	public String getName() {
	return name;
}
	public void setName(String name) {
		this.name=name;
	}

public int getBaseSalary() {
	return baseSalary;
}
public void setBaseSalary(int baseSalary) {
	this.baseSalary=baseSalary;
}
	
 int calculateSalary() {
    return baseSalary;
}
}

// FullTimeEmployee
 class FullTimeEmployee extends Employee {
 int calculateSalary() {
	 int PF= 1000;
    return getBaseSalary() + PF;
}
}

// Intern
class Intern extends Employee {
 int calculateSalary() {
    return getBaseSalary();
}
}

    class EmployeeSalary{
	public static void main(String [] args) {
		FullTimeEmployee emp1=new FullTimeEmployee();
		emp1.setName("priyanka");
		emp1.setBaseSalary(50000);
		
		Intern emp2=new Intern();
		emp2.setName("aadvi");
		emp2.setBaseSalary(25000);
		System.out.println("Full time salary:" +emp1.calculateSalary());
		System.out.println("Intern salary:" +emp2.calculateSalary());
		System.out.println(emp1.getName());
		System.out.println(emp2.getBaseSalary());
	}
}
	
	
	 
	
	
	

	
	


