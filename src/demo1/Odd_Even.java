package demo1;

import java.util.Scanner;

public class Odd_Even 
{
	static int a;
	
	
	
	public static void Demo()
	{
		if(a%2==0)
		{
			System.out.println(a+ "Number is Even");
			
		}
		else
		{
			System.out.println(a+ " Number is Odd");
		}
		
	}

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		a=sc.nextInt();//used to get input of integer type
		
		sc.close();
		Demo();

	}

}


