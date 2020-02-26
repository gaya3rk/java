package house;

public class Kitchen {
	public static void main(String args[])
	{
	String appliances[]= {"Fridge","Oven","Mixer"};
	for(int i=0;i<appliances.length;i++)
	{
		System.out.println(appliances[i]);
	}
	String b[]=new String [appliances.length];
	for(int i=0;i<b.length;i++)
	{
		b[i]=appliances[i];
		//System.out.println(b[i]);
	}
	
	System.gc();
	}	
	}
	
	
	


