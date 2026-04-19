package a10collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListDemo {
	public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
		//Array list
		ArrayList<Integer> marks=new ArrayList<>();
		
		for(int i=1;i<=5;i++) {
			System.out.println("Student" + i +":");
		marks.add(sc.nextInt());
	}

          //for each loop
		System.out.println("\nmarks");
		for(int mark :marks) {
			System.out.println(mark);
		}
		
		//insert a mark of 95 at index 2
		marks.add(2,95);
		System.out.println("After inserting 95 at index 2:" +marks);
		
		//Update the mark at index 0 to 88
		marks.set(0,88);
		System.out.println("After updating the marks at index 0to 88:" +marks);
		
		//Remove the student at index 3
		marks.remove(3);
		System.out.println("Remove the student at index 3:" +marks);
		
		//Search if a mark of 75 exists in the list
		if(marks.contains(75)) {
			System.out.println("Found");
		}else {
			System.out.println("Not Found");
		}
			//Sort the marks in ascending order and display the ranked list.
		
		Collections.sort(marks);
		System.out.println("\nSorted marks in Ascending Order: " +marks);
			
			//Print the highest and lowest marks
		int min = Collections.min(marks);
        int max = Collections.max(marks);

        System.out.println("Lowest Marks: " + min);
        System.out.println("Highest Marks: " + max);

        sc.close();
		}
		
		
	}
	
	


