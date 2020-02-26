import java.util.*;
public class name {
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		String name;
		int tot=0,n;
		System.out.println("Enter the name");
		name=sc.nextLine();
		System.out.println("Enter no.of subjects");
		n=sc.nextInt();
		int marks[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the marks");
			marks[i]=sc.nextInt();	
			tot=tot+marks[i];
		}
		sc.close();
		System.out.println("Name is:" +name);
		System.out.println("total is:" +tot);
	}

}
