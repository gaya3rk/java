//12.  Write a program to find the sum of all the prime numbers in the range n to m.Display each prime number and also the final sum.

import java.util.Scanner; 
class twelve
{
public static void main(String[] args)
{
System.out.print("Enter first number");
Scanner inp=new Scanner(System.in);
int n=inp.nextInt();
System.out.print("Enter last number");
int m=inp.nextInt();
int sum=0,i,j,c;
for(i=n;i<=m;i++)
{
	c=0;
	for(j=2;j<i;j++)
	{
	if((i%j)==0)
	c=1;
	}
	if(c==0)
	{
	System.out.println(i);
	sum=sum+i;
	}
}
System.out.println("sum is "+sum);
}
}