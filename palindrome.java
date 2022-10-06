package day1;
import java.util.Scanner;
import java.io.*;

public class palindrome 
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in); 
		System.out.println("Enter the text :");
		String s1=  sc.next();
		String s2= "";
		int i,len;
		len= s1.length();
		for(i=len-1;i>=0;i--)
		{
			s2= s2 + s1.charAt(i);
		}
		System.out.println("The reverse of the String is : "+s2);
		if (s2.equalsIgnoreCase(s1))
		{
			System.out.println("The String is Palindrome");
		}
		else
		{
			System.out.println("The String is not Palindrome");
		}
	}
		
}
