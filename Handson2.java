import java.util.*;
public class Handson2 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a ten digit number in the format XXX-XXX-XXXX");
		String s=sc.nextLine();
		int x;
		x=UserMainCode2.validateNumber(s);
		if(x==1)
		{
			System.out.println("Valid number format");
			
		}
		if(x==(-1))
			System.out.println("Invalid number format");
		
	}

}

class UserMainCode2
{
	static int validateNumber(String st)
	{
	if((st.charAt(3)=='-')&&(st.charAt(7)=='-'))
	{
		return 1;
	}
	else
		return(-1);
	}
}