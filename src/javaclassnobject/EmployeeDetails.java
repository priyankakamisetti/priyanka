package javaclassnobject;

public class EmployeeDetails {
	public static void main(String[] args) {
     
        Employee emp1 = new Employee("Priya", 101, 50000);
        Employee emp2 = new Employee("yamini", 102, 60000);
        Employee emp3 = new Employee("Aadvi", 103, 55000);

        
        emp1.displayInfo();
        emp2.displayInfo();
        emp3.displayInfo();
    }
}

