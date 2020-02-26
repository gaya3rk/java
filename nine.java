// 9.Write a program to find the reverse of a number. Store the reverse value in a different variable. Display the reverse.

import java.util.Scanner; 
class nine
{
public static void main(String[] args)
{
System.out.println("Enter a number");
Scanner inp=new Scanner(System.in);
int n=inp.nextInt();
int reversed=0;
	while(n!= 0) 
	{          
	int x = n % 10;
	reversed = reversed * 10 + x;
	n /= 10;
	}
System.out.println("Reversed number is:" +reversed);
}
}