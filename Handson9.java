import java.util.*;
import java.text.*;
public class Handson9 {
	public static void main(String args[]) throws Exception
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the date");
		String s=sc.nextLine();
		sc.close();
		int x=UserMainCode9.validateDate(s);
		if(x==1)
		{
			System.out.println("Valid format");
		}
		else
			System.out.println("Invalid format");
				
	}

}
class UserMainCode9
{
	static int validateDate(String s) throws Exception
	{
	Date d=new SimpleDateFormat("dd/mm/yyyy").parse(s);
	SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
	String s1=sdf.format(d);
	if(s1.equals(s))
	{
		return 1;
		
	}
	else
		return -1;
			
	}
}