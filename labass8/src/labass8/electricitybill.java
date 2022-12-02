package labass8;

import java.util.Scanner;

public class electricitybill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // Scanner class 
		System.out.println("Enter the units :");
		int unit = 0;
		double TotalCharges;
		unit=sc.nextInt();
		
		if(unit>0 && unit <=100)  //using if else statement 
		{
			TotalCharges=unit*1.20;
			System.out.println("your Electricity bill is :"+TotalCharges +".Rs");
		}
		else if(unit>100 && unit <=300) 
		{
			TotalCharges=unit*2.0;
			System.out.println("your Electricity bill is :"+TotalCharges +".Rs");
		}
		else if(unit>300) 
		{
			TotalCharges=unit*3.0;
			System.out.println("your Electricity bill is :"+TotalCharges +".Rs");
		}
		else 
		{
			System.out.println("Invalid input");
		}
	}

}
