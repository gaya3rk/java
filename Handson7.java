import java.util.*;
public class Handson7 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a positive number");
		int n=sc.nextInt();
		int x;
		x=UserMainCode7.reverseNumber(n);
		System.out.println(x);
	}

}
class UserMainCode7
{
	static int reverseNumber(int num)
	{
		int a,b=0;
		while(num>0)
		{
			a=num%10;
			b=b*10+a;
			num=num/10;
		}
		return b;
	}
}
