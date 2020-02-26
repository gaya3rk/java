import java.util.*;
public class Handson8 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> a= new ArrayList<Integer>();
		ArrayList<Integer> b= new ArrayList<Integer>();
		System.out.println("Enter the elements of first array");
		for(int i=0;i<5;i++)
		{
			a.add(sc.nextInt());
		}
		System.out.println("Enter the elements of second array");
		for(int i=0;i<5;i++)
		{
			b.add(sc.nextInt());
		}
		ArrayList <Integer> arr= UserMainCode8.sortMergedArrayList(a, b);
		for(Integer o:arr)
		{
	System.out.println(o);	
	}
	}
}
class UserMainCode8
{
	static ArrayList<Integer> sortMergedArrayList(ArrayList<Integer> x,ArrayList<Integer> y)
	{
		x.addAll(y);
		Collections.sort(x);
		ArrayList<Integer> c= new ArrayList<Integer>();
		c.add(x.get(2));
		c.add(x.get(6));
		c.add(x.get(8));
		return c;
	}
}
