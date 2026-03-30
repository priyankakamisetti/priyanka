package shapeareacalculator;

public class Shape {

	    public void calculatedArea() {
	    	
	        System.out.println("Calculating area");
	    }
}

	// Circle
	    
	 class Circle extends Shape{
		double radius;
	public	void calculatedArea() {
		double area=Math.PI * radius * radius;
			System.out.println("Area of circle:" +area);
		}
	}
	
	//rectangle
	
	 class Rectangle extends Shape{
		double length;
		double width;
		public void calculatedArea() {
			double area= length * width;
			System.out.println("Area of Rectngle:" +area);
			
		}	

	    
	        
	    }


