//14.  Write a program to find the factorial of a number using recursion.

import java.util.Scanner;
class fourteen
{
public static void main(String[] args)
{
Scanner inp=new Scanner(System.in);
System.out.println("Enter a number");
int n=inp.nextInt();
int p;
fourteen d=new fourteen();
p=d.fact(n);
System.out.println("The factorial of "+n+" is "+p);
}
int fact(int n)
{
if(n>=1)
return n*fact(n-1);
else
return 1;
}
}
