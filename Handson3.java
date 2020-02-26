import java.util.*;
public class Handson3 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int x;
		x=UserMainCode3.sumOfSquaresOfEvenDigits(n);
		System.out.println(x);
		
	}

}

class UserMainCode3
{
	static int sumOfSquaresOfEvenDigits(int a)
	{
		int m,s=0;
		while(a>0)
		{
		m=a%10;
		if((m%2)==0)
		{
			s=s+(m*m);
		}
		a=a/10;
		}
		return s;
	}
}
