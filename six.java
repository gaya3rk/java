/* 6.Write a program to accept a number and display the last digit of the number in words.*/

import java.util.Scanner; 
class six
{
public static void main(String[] args)
{
System.out.println("Enter a number");
Scanner inp=new Scanner(System.in);
int a=inp.nextInt();
switch(a%10)
{
case 0:
System.out.println("zero");
break;
case 1:
System.out.println("one");
break;
case 2:
System.out.println("two");
break;
case 3:
System.out.println("three");
break;
case 4:
System.out.println("four");
break;
case 5:
System.out.println("five");
break;
case 6:
System.out.println("six");
break;
case 7:
System.out.println("seven");
break;
case 8:
System.out.println("eight");
break;
case 9:
System.out.println("nine");
break;
default:
System.out.println("invalid");
break;
}}}





