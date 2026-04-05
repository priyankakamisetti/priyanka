package javaarray;

public class MarksArray {
	public static void main(String[] args) {
		int[] marks={78, 92, 55, 88, 46, 73};
		    int total = 0;
	        int highest = marks[0];
	        int lowest = marks[0];
	        int countAbove75 = 0;
	        
	        // Print marks
	        System.out.println("Marks:");
	        for (int i = 0; i < marks.length; i++) {
	            System.out.println(marks[i]);
                //total
	            total += marks[i];

	            // Find highest
	            if (marks[i] > highest) {
	                highest = marks[i];
	            }

	            // Find lowest
	            if (marks[i] < lowest) {
	                lowest = marks[i];
	            }

	            // Count marks above 75
	            if (marks[i] > 75) {
	                countAbove75++;
	            }
	        }

	   
	        double average = (double) total / marks.length;

	  
	        System.out.println("\nTotal Marks: " + total);
	        System.out.println("Average Marks: " + average);
	        System.out.println("Highest Mark: " + highest);
	        System.out.println("Lowest Mark: " + lowest);
	        System.out.println("Students scoring above 75: " + countAbove75);
	    }
	}

