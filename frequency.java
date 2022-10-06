package day1;
import java.io.*;
import java.util.Scanner;
public class frequency {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your text : ");
		String s1=sc.next();
		System.out.println("Enter the element whose frequency is to be found :");
		char ch=sc.next().charAt(0);
		int i, len,count=0;
		len= s1.length();
		for(i=0;i<len-1;i++)
		{
			if (s1.charAt(i)==ch)
			{
				count++;
			}
		}
		System.out.println("The frequency of "+ch+" is "+count);
	}

}
