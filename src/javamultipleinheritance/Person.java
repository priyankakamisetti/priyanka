package javamultipleinheritance;

public class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name =name;
		this.age = age;
	}

	// constructor
	void displayPersonInfo() {
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);

	}
}

//Employee class
class Employee extends Person {
	String company;
	double salary;

	// Constructor using super
	Employee(String name, int age, String company, double salary) {
		super(name, age);
		this.company = company;
		this.salary = salary;
	}

	// Method
	void displayEmployeeInfo() {
		super.displayPersonInfo();
		System.out.println("Company: " + company);
		System.out.println("Salary: " + salary);
	}

}
	// Manager class
	class Manager extends Employee {
		String department;
		int teamSize;

		// Constructor using super
		Manager(String name, int age, String company, double salary, String department, int teamSize) {
			super(name, age, company, salary);
			this.department = department;
			this.teamSize = teamSize;
		}

		// Method
		void displayManagerInfo() {
	        super.displayEmployeeInfo();
	        System.out.println("Department: " + department);
	        System.out.println("Team Size: " + teamSize);
	
		}
	 
 }
