package Program4;

public class Main {
	    //Driver Code
	    public static void main(String[] args)
	    {
	        Rectangle obj = new Rectangle();
	        // Calling function
	        obj.Area(30, 20);
	        obj.Area(12.5, 4.5);
	        
	        Square obj2 = new Square();
	        // Calling function
	        obj2.Area(20);
	        obj2.Area(5.2);
	        
	    }
	}
	class Square 
	{
	    // Overloaded function to
	    // calculate the area of the square
	    // It takes one double parameter
	    void Area(double side)
	    {
	        System.out.println("Area of the Square: "+ side * side);
	    }
	    // Overloaded function to
	    // calculate the area of the square
	    // It takes one float parameter
	    void Area(float side)
	    {
	        System.out.println("Area of the Square: "+ side * side);
	    }
	}
	
	class Rectangle 
	{
	     // Overloaded function to
	    // calculate the area of the rectangle
	    // It takes two double parameters
	    void Area(double l, double b)
	    {
	        System.out.println("Area of the rectangle: " + l * b);
	    }
	    // Overloaded function to
	    // calculate the area of the rectangle.
	    // It takes two float parameters
	    void Area(int l, int b)
	    {
	        System.out.println("Area of the rectangle: " + l * b);
	    }
	}


