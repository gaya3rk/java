/* 4. Write a program to accept three numbers and find the largest and second largest values of three numbers.*/

import java.util.Scanner; 
class four
{
public static void main(String[] args)
{
System.out.println("Enter three numbers");
Scanner inp=new Scanner(System.in);
int a=inp.nextInt();
int b=inp.nextInt();
int c=inp.nextInt();
if((a>b)&&(a>c))
{
System.out.println(a+" is largest");
	if(b>c)
	System.out.println(b+ "is 2nd largest");
	else
	System.out.println(c+ "is 2nd largest");
}
else if(b>c)
{
System.out.println(b+" is largest");
	if(a>c)
	System.out.println(a+" is 2nd largest");
	else
	System.out.println(c+ "is 2nd largest");
}
else
{
System.out.println(c+" is largest");
	if(a>b)
	System.out.println(a+ " is 2nd largest");
	else
	System.out.println(b+ " is 2nd largest");
}}}
