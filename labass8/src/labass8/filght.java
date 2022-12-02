package labass8;

import java.util.Scanner;

public class filght {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter no of Rows ");
		Scanner sc =new Scanner(System.in); // Scanner class
		
		int r= sc.nextInt(); // take input from user
		boolean flag=true;
		int sum=0;
		
		if(r<0)  // use if else statement
		{
			System.out.println("invalid");
		}
		else 
		{
			for( int i=0;i<r;i++)  // for loop
			{
				int peopleperr=sc.nextInt();
				if(peopleperr<0) 
				{
					System.out.println("invalid");
					flag =false;
					break;
				}
				else 
				{
					sum+=peopleperr;
					System.out.println(peopleperr);
				}
				
			}
			if(flag==true)
			System.out.println("total no of passanger"+sum);
		}
	}

}
