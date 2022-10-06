package day1;
	abstract class Shap
	{
	    abstract public void numberOfSides();
	}
	class Triangle extends Shap
	{
	    public void numberOfSides()
	    {
	        System.out.println("TRIANGLE has 3 sides");
	    }
	}
	class Rectangle extends Shap
	{
	    public void numberOfSides()
	    {
	        System.out.println("RECTANGLE has 4 sides");
	    }
	}
	class Hexagon extends Shap
	{
	    public void numberOfSides()
	    {
	        System.out.println("HEXAGON has 6 sides");
	    }
	}
	public class Abstract 
	{
	    public static void main(String[]args)
	    {
	        Triangle triangle=new Triangle();
	        Rectangle rectangle=new Rectangle();
	        Hexagon hexagon=new Hexagon();
	        triangle.numberOfSides();
	        rectangle.numberOfSides();
	        hexagon.numberOfSides();
	    }
	}


