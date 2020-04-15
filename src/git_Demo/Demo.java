package git_Demo;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=0;
		System.out.println("Enter the number");
		n=sc.nextInt();
		if(n>0)
		{
			System.out.println(n+" is positive.");
		}	
		else if(n<0)
		{
			System.out.println(n+" is negative");
		}
		else 
		{
		    System.out.println("The number is zero ");	
		}
		
}
}
/* TODO Auto-generated method stub
int n,a=1,b=1;
n=0;

System.out.println("1\n1");
while(n<100)
{
	n=a+b;
	System.out.println(n + " ");
	a=b;
	b=n;
	*/
	
	
	


