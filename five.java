/*5. Write a program to accept a student’s name and three marks.
 Display the total and average. Display result as First class, Second class,
 Pass class and Fails.*/

import java.util.Scanner; 
class five
{
public static void main(String[] args)
{
System.out.println("Enter your name");
Scanner inp=new Scanner(System.in);
String s=inp.nextLine();
System.out.println("Enter your marks");
int x=inp.nextInt();
int y=inp.nextInt();
int z=inp.nextInt();
int total=x+y+z;
System.out.println("Total is "+total);
int avg=(total)/3;
System.out.println("Average is "+avg);
	if(total>240)
	System.out.println("First class");
	else if((total>200)&&(total<240))
	System.out.println("Second class");
	else if((total>150)&&(total<200))
	System.out.println("Pass class");
	else
	System.out.println("Failed");
}
}