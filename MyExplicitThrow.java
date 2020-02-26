
public class MyExplicitThrow 
{
	public static void main(String a[])
	{
		try
		{
			MyExplicitThrow met =new MyExplicitThrow();
			System.out.println("length of junk is" +met.getStringSize("JUNK"));
			System.out.println("length of wrong is" +met.getStringSize("WRONG"));
			System.out.println("length of null string is" +met.getStringSize(null));
	
		}
		catch(Exception ex)
		{
			System.out.println("Exception message:"+ex.getMessage());
			
		}
	}
		public int getStringSize (String s) throws Exception
		{
			if(s==null)
			{
				throw new Exception("null is passed");
			}
			return s.length();
		}
}
