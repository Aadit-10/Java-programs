package day1;
import java.util.Scanner;
class Employee
{
	double GS,bs,da,hra;
	double calcSalary() 
	{
		GS= bs+(bs*(da/100))+(bs*(hra/100));
		return GS;
	}
	
	void  display ()
	{
		System.out.println("The gross salary of the employee is : "+GS);	
	}
}
class Engineer extends Employee
{
	
}

public class Inheritance {
	public static void main(String []args)
	{
		Scanner sc =new Scanner(System.in); 
		Engineer eng =new Engineer();
		System.out.println("Enter the Basic salary of the Engineer : ");
		eng.bs= sc.nextInt();
		System.out.println("Enter the DA of the engineer : ");
		eng.da=sc.nextInt();
		System.out.println("Enter the HRA of the engineer : ");
		eng.hra = sc.nextInt();
		eng.calcSalary();
		eng.display();
		
	}	
}
