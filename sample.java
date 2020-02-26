
//import java.util.*;
public class sample 
{
	public static void main(String ar[])
	{
		//int ar[]=new int[10];
	//Scanner sc=new Scanner (System.in);
	
		int gr=Integer.parseInt(ar[0]);
		
		for(int i=1;i<ar.length;i++)
		{	
			if(Integer.parseInt(ar[i])>gr)
			{
				gr=Integer.parseInt(ar[i]);
			}
			
		}
		System.out.println(gr);
	}

	
	
	
}
