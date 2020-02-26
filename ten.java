//10.  Write a program to find the factorial of a non-negative number.


import java.util.Scanner; 
class ten
{
public static void main(String[] args)
{
System.out.println("Enter a number");
Scanner inp=new Scanner(System.in);
int n=inp.nextInt();
int i,f=1;
if(n>0)
{
for(i=n;i>0;i--)
{
f=f*i;
}
System.out.println("Factorial is:" +f);
}
else
System.out.println("Enter a positive number");
}
}