/* 2. Write a program to accept three numbers and 
find the largest of three numbers using ternary operator.*/


import java.util.Scanner;
class two
{
public static void main(String[] args)
{
int lrg;
System.out.println("Enter three numbers");
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
lrg=(((a>b)&&(a>c))?a:((b>c)?b:c));
System.out.println(lrg+" is largest");
}
} 