import java.util.*;
public class Handson4 {
	public static void main(String args[])
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string of even length");
		String str=sc.nextLine();
		String x;
		if((str.length()%2)!=0)
		{
			System.out.println("String entered is not of even length");
			//str=sc.nextLine();
		}
		else
		{
		x=UserMainCode4.getMiddleChars(str);
		System.out.println(x);		
	}	}

}

class UserMainCode4
{
	static  String getMiddleChars(String s)
	{
		String sub;
		int l=s.length();
		sub=s.substring(((l/2)-1),((l/2)+1));
		return sub;
	}
}