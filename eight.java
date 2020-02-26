//8.Write a program to find the sum of all odd numbers from 1 to N. Accept N. Display the sum.

import java.util.Scanner; 
class eight
{
public static void main(String[] args)
{
System.out.println("Enter a number");
Scanner inp=new Scanner(System.in);
int n=inp.nextInt();
int i,sum=0;
for(i=0;i<n;i++)
{
	if((i%2)!=0)
	sum=sum+i;
}
System.out.println("sum of all odd numbers:" +sum);
}
}