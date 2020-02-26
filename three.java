/*3.Write a program to accept a number and display 
whether the number is odd or even using the ternary operator.*/

import java.util.Scanner; 
class three
{
public static void main(String[] args)
{
System.out.println("Enter a number");
Scanner inp=new Scanner(System.in);
int x=inp.nextInt();
String s=(((x%2)==0)?"even":"odd");
System.out.println(s);
}
}