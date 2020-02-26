import java.util.*;
public class Handson6 {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string");
	String str=sc.nextLine();
	System.out.println("Enter a number");
	int n=sc.nextInt();
	String x;
	if((str.length())>=2*n)
	{
	x=UserMainCode6.formNewWord(str,n);
	System.out.println(x);
	}
	else
	{
	System.out.println("Enter a longer string");	
	}
	}
}
	
class UserMainCode6
{
	static  String formNewWord(String s,int a)
	{
		String s1,s2;
		s1=s.substring(0,a);
		int l=s.length();
		s2=s.substring(l-a,l);
		return(s1.concat(s2));
		
	}
	
}
