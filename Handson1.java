import java.util.*;
public class Handson1 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		int x;
		x=usermaincode.checksum(num);
		if(x==1)
		{
			System.out.println("Sum of odd digits is odd");
			
		}
		if(x==(-1))
		{
			System.out.println("Sum of odd digits is even");
		}
	}

}
class usermaincode
{
	static int checksum(int n)
	{
		int a,sum=0;
		while(n>0)
		{
			a=n%10;
			if((a%2)!=0)
			{
				sum=sum+a;
			}
			n=n/10;
		}
		if((sum%2)!=0)
		{
			return 1;
		}
		else
		{
			return(-1);
		}
	}
}
