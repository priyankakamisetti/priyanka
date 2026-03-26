package javacontrolstatements;

public class JavaControlStatements {
	
	 public static void main(String[] args) {
	        int age = 16;

	        if (age >= 18) {
	            System.out.println("Entry allowed");
	        } else {
	            System.out.println("Entry not allowed");
}
	        
	        
	        //if else
	        
	        int salary=45000;
	        if(salary >= 30000) {
	        	System.out.println("Loan approved");
	        }else {
	        	System.out.println("Loan Rejected");
	        }
	        
	        
	        //if else if p3
	        
	        int marks=73;
	        if(marks >= 90) {
	        	System.out.println("grade A");
	       }else if (marks >= 75) {
	            System.out.println("Grade B");
	        } else if (marks >= 60) {
	            System.out.println("Grade C");
	        } else if (marks >= 45) {
	            System.out.println("Grade D");
	        } else {
	            System.out.println("Grade F");
	        }	        	
	 
	        
	        //if else if p4
	        
	 int billAmount=1200;
	 if(billAmount >= 2000) {
		 System.out.println("20%");
	 }else if (billAmount >= 1000) {
		 System.out.println("10%");
	 }else if (billAmount >= 500) {
		 System.out.println("5%");
	 }else {
		 System.out.println("no discount");
	 }
	 
	 
	 

	 //if else if p5
	
	 
	 int temp=38;
	 if(temp >= 35) {
		 System.out.println("very hot");
	 } else if (temp >= 25) {
		 System.out.println("warm");
	 } else if (temp >= 15) {
		 System.out.println("pleasent");
	 }else {
		 System.out.println("cold");
	 	 
	 }
	 
	 
	 //switch p6
	 
	 int dayNumber=3;
	 switch(dayNumber) {
	 case 1: 
		 System.out.println("Monday");
	 case 2:
		 System.out.println("Tuesday");
	 case 3:
		 System.out.println("Wednesday");
	 case 4:
		 System.out.println("Thursday");
	 case 5:
		 System.out.println("Friday");
	 case 6:
		 System.out.println("Saturday");
	 case 7:
		 System.out.println("Sunday");
		 break;
		 default:
			 System.out.println("Invalid Day");
			 
	 }
	 
	 //switch p7
	 
	 String day="Monday";
	 switch(day) {
	 case "Monday":
		 System.out.println("idly");
	 case "tuesday":
		 System.out.println("Dosa");
	 case "wednesday":
		 System.out.println("poha");
	 case "thursday":
		 System.out.println("upma");
	 case "friday":
		 System.out.println("vada");
		 break;
		 default:
			 System.out.println("No special Today");
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
	 
	 
	 
}

















