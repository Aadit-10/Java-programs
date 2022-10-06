package day1;
import java.util.Scanner;
class Employeee
{
	int age,phno,salary;
	String name;
	String address;
	
	void printSalary()
	{
		System.out.println("The Salary of the employee is :"+salary);
	}
	void read()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the name : ");
		name = sc.next();
		System.out.println("Enter the age : ");
		age =sc.nextInt();
		System.out.println("Enter the Phone Number : ");
		phno= sc.nextInt();
		System.out.println("Enter the address : ");
		address=sc.next();
		System.out.println("Enter the salary : ");
		salary=sc.nextInt();
	}
	void display()
	{
		System.out.print("\nName is : "+name);
		System.out.println("Age is : "+ age);
		System.out.println("Phone Number is :"+phno);
		System.out.println("Address is :"+address);
		System.out.println("Salary is : "+salary);
	}
}
class Officer extends Employeee
{
	String specialisation;
}
class Manager extends Employeee
{
	String department;
}
public class ScnInheritance 
{
	public static void main(String []args)
	{
		Officer off =new Officer();
		Manager mag=new Manager();
		off.read();
		mag.read();
		off.display();
		mag.display();
	}
}
	
