package day1;
class shape 
{
	void area(int r)
	{
		 
		 double area =  3.14*r*r;
		 System.out.println("Area of triangle is : "+area);
	}
	 void area (int l,int b)
	 {
		 int area = l*b;
		 System.out.println("Area of Rectangle : "+area);
	 }
	 void area (double b,double h)
	 {
		 double area = .5 *b*h;
		 System.out.println("Area of Triangle :" +area);
	 }
}

public class methodOverloading 
{
	public static void main(String[] args)
	{
		shape s =new shape();
		s.area(2);
		s.area(3,4);
		s.area(3.0,4.0);
	}
}
