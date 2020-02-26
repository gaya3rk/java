//13.  Write a program to store N elements in an array of integer. Display the elements.
// Accept a number to be searched. Display whether the number is found or not in the array (LINEAR SEARCH)

import java.util.Scanner; 
class thirteen
{
public static void main(String[] args)
{
Scanner inp=new Scanner(System.in);
int n,i,a,flag=0;
System.out.println("Enter number of elements");
n=inp.nextInt();
System.out.println("Enter the elements");
int[] arr=new int[n];
	for(i=0;i<n;i++)
		
	{
	arr[i]=inp.nextInt();
	}
	System.out.println("The elements are:");
	for(i=0;i<n;i++)
	System.out.println(arr[i]);
System.out.println("enter the number to be searched");
a=inp.nextInt();
	for(i=0;i<n;i++)
	{
	if(a==arr[i])
	{
	System.out.println("element found");
	flag=1;
	}
	}
if(flag==0)
System.out.println("element not found");
}
}