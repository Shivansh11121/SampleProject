package demo1;

import java.util.Scanner;

public class Factorial 
{
	


int num;
int fact=1;
public void New()
{

Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number= ");
 num=sc.nextInt();
 
 for(int i=1;i<=num;i++)
 {
	 fact=fact*i;
 }
 System.out.println("Factorial is: "+fact);
		
}


public static void main(String[] args)
{
	
	Factorial f=new Factorial();
	f.New();
}
}