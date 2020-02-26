
class Studentt
{
	String name;
	Studentt(String s){}
	void setName(String na)
	{
		name=na;
	
	}
	String getName()
	{
		return name;
	}
}
public class tests {
	public static void change(Studentt p)
	{
		p.setName("mary");
	
	}
	public static void main(String args[])
	{
		Studentt s1=new Studentt("john");
		change(s1);
		System.out.println("s1=" +s1.getName());
		
	}

}
