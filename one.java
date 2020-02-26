/* 1. Write a program to accept a double value. 
Separate the whole value from the fractional value and store them in two variables. 
Display the same.*/

import java.util.Scanner; 
class one
{
public static void main(String[] args)
{
System.out.println("Enter a number");
Scanner inp=new Scanner(System.in);
double num=inp.nextDouble();
int integer=(int)num;
double decimal=num-(int)num;
System.out.println(integer);
System.out.println(decimal);
}
}