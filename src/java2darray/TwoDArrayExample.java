package java2darray;

public class TwoDArrayExample {
	public static void main(String[] args) {
		int[][] marks = {
	            {80, 75, 90},
	            {70, 85, 88}
	        };

	        for (int i = 0; i < marks.length; i++) {
	            for (int j = 0; j < marks[i].length; j++) {
	                System.out.print(marks[i][j] + " ");
	            }
	            
	            
	            System.out.println();
		
	}

}
}
