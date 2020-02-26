import java.util.*;
class studentt
{
	String name;
	studentt(String s)
	{
		name=s;
	}
	String getName()
	{
		return name;
	}
}
public class testt 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of elements");
		int ele=sc.nextInt();
		studentt s1[]=new studentt[ele];
		//s1[0]=new studentt("mary");
		//s1[1]=new studentt("john");
		
		for(int i=0;i<ele;i++)
		{
			s1[i]=new studentt(sc.next());
		//studentt s1=new studentt("john");
		}
		sc.close();
		for(int i=0;i<ele;i++)
		{
			System.out.println("Name:" +s1[i].getName());

		}
		
	}
}
