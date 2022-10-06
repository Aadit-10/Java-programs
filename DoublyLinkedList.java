package dayx;

import java.util.Scanner;
import java.util.ArrayList; 
public class DoublyLinkedList
{
	
	public static void main()
	{
		ArrayList<Integer> ll=new ArrayList<>();
		int ch;
		Scanner sc =new Scanner (System.in);
		do {
				System.out.println("1.Insert ");
				System.out.println("2.Delete ");
				System.out.println("3.Display ");
				System.out.println("4.Exit");
				System.out.println("Enter your choice :");
		
				 ch=sc.nextInt();
		
				switch(ch)
				{
					case 1:
						System.out.println("Enter the data :");
						int data =sc.nextInt();
						ll.add(data);
						System.out.println("The list is :"+ll);
						break;
				
					case 2:
						System.out.println("Enter the position to be removed : ");
						int pos =sc.nextInt();
						int val=ll.remove(pos);
						System.out.println("Element deleted is :"+val);
						System.out.println("The list is :"+ll);
						break;
				
					case 3:
						System.out.println("The list is :"+ll);
						break;
					case 4:
						System.out.println("Thank you");
						
					default: 
						System.out.println("Hope you had good eyes @%#$");
				}
		}while(ch!=4);
	}
	
}