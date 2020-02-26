import java.util.*;
		import java.text.ParseException;
		import java.text.SimpleDateFormat;
		import java.text.DateFormat;
		import java.util.Date;
abstract class animal 
{
	abstract void eat();

}
class tiger extends animal
{
	void eat()
	{
		System.out.println("non veg");
		
	}
}
class goat extends animal
{
	void eat()
	{
		System.out.println("veg");
		class birthdate
		{
		public static void main(String args[]) throws Exception
		{
		String y="07/12/1997";
		Date s=new SimpleDateFormat("dd/MM/yyyy").parse(y);
		System.out.println(y+" "+s);
		}
		} 
	}
}
class tt
{
public static void main(String args[])
{
	animal m;
	m=new tiger();
	m.eat();
	m=new goat();
	m.eat();
}
}