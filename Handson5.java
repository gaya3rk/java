import java.util.*;
public class Handson5 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		int x;
		x=UserMainCode5.checkCharacters(str);
		if(x==1)
		{
			System.out.println("The string is valid");
		}
		else
			System.out.println("The string is invalid");
		
	}

}
class UserMainCode5
{
	static int checkCharacters(String s)
	{
		if((s.charAt(0))==(s.charAt(s.length()-1)))
		{
			return 1;
		}
		else
			return(-1);
	}
}