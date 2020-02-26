// 11.  Write a program to generate the following series:

   //         1, -2, 3, -4, 5, -6, … N

import java.util.Scanner; 
class eleven
{
public static void main(String[] args)
{
System.out.println("Enter a number");
Scanner inp=new Scanner(System.in);
int n=inp.nextInt();
int i;
for(i=1;i<=n;i++)
{
	if((i%2)==0)
	{
System.out.println("-"+i);
	}
	else
	{
System.out.println(i);
}
}
}
}