
public class Exer6 {
	public static void main(String args[])
	{
		try
		{
			int arr[]=new int[-6];
			for(int i=0;i<arr.length;i++)
			{
				System.out.println(arr[i]);
			}
		}
			catch(NegativeArraySizeException ne)
			{
				System.out.println(ne);
			}
		try
		{
			int arr1[]={1,2,3,4,5};
			System.out.println(arr1[10]);	
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println(ai);
		}
		try
		{
			String str[]={"aa","bb","cc"};
			System.out.println(str[5]);
			
		}
		catch(StringIndexOutOfBoundsException se)
		{
			System.out.println(se);
		}
		
	}

}
