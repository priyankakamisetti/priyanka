package staticcounterproblem;

public class StudentDetails {
	 static int totalStudents = 0;

	    StudentDetails() {
	        totalStudents++; 
	    }

	    static void displayTotalStudents() {
	        System.out.println("Total Students: " + totalStudents);
	    }

	    public static void main(String[] args) {
	        // creating objects
	        StudentDetails s1 = new StudentDetails();
	        StudentDetails s2 = new StudentDetails();
	        StudentDetails s3 = new StudentDetails();
	        StudentDetails s4=new StudentDetails();

	        // display total students
	        StudentDetails.displayTotalStudents();
	        
	    }
	}


