package a10collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;



class EmployeeLibrary{
	
	 List<String> employees = new ArrayList<>();
	static LinkedHashSet<String> departments = new LinkedHashSet<>();
	       HashMap<String, Double> salaryMap = new HashMap<>();

	       
	       public void displayEmployees() {
	    	   System.out.println("-----Employee Names-----");
	    	   for(String Employee:employees) {
	    		   System.out.println(Employee);
	    		   }
	       }
	       
	       
	       public static void displayDepartments() {
	    	   System.out.println("-----Departments------");
	    	   for(String Department:departments) {
	    		   System.out.println(Department);
	    	   }
	       }
	       
	       void SalaryMap() {
	    	   System.out.println("-------Salary-------");
	    	   for(String Salary:salaryMap.keySet()) {
	    		   System.out.println(Salary + "->" + salaryMap.get(Salary));
	    	   }
	       }


	       
	      
	       // Search for employee
	        
              void searchEmployee(String employeeName) {
	        if (employees.contains(employeeName)) {
	            System.out.println("Salary" + salaryMap.get(employeeName));
	        } else {
	            System.out.println("employee name not found.");
	        }
              }
	       
              // Remove employee
             public  void removeName(String employee) {
            	   if(salaryMap.containsKey(employee)) {
            		   salaryMap.remove(employee);
    	    		   System.out.println("Removed Employee:" +employee);
    	    	   }else {
    	    		   System.out.println("Employee Not Found");
    	    	   }
    	    	   if(employees.contains(employee)) {
    	    		   employees.remove(employee);
    	    		   System.out.println("Removed Employee:" +employee);
    	    		   }else {
    	    			   System.out.println("Employee Not Found");
    	    		   }
    	       }
    	       
               public void total(){
            		System.out.println("Total Employees: " + employees.size());
            	    System.out.println("Total Departments: " + departments.size());
            	}
               
               
		   public void addEmployee(String employee, String department, double salary) {
			employees.add(employee);
			departments.add(department);
			salaryMap.put(employee , salary);
			
		   }
	     
	       
}	     
public class EmployeeProjectDemo {

	public static void main(String[] args) {
		
    EmployeeLibrary obj= new EmployeeLibrary();
    obj.addEmployee("Priyanka" , "Software" ,50000.00 );
    obj.addEmployee("Yamini" , "Manager" , 100000.00);
    obj.addEmployee("Advitha" , "Medical" , 200000.00);
    obj.addEmployee("Naresh" , "VFX Designer" ,300000.00 );
    obj.addEmployee("Vijay" , "Finance analyst" , 50000.00);
	obj.displayEmployees();
	EmployeeLibrary.displayDepartments();
	obj.SalaryMap();
	obj.total();
    Scanner sc= new Scanner(System.in);
    
    System.out.print("Enter employee name ");
    String employee = sc.nextLine();
    obj.searchEmployee(employee);
    
    System.out.println("Enter employee name to remove:");
    String employees = sc.nextLine();
    obj.removeName(employees);
 
     
    sc.close();
	}
}

