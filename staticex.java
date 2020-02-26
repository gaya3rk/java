
public class staticex {
	static
	{
		System.out.println("first static block");}
public staticex()
{
	System.out.println("constructor");}
public static String staticString="static variable";
static
{
	System.out.println("second static block and " +staticString);}
public static void main(String args[])
{
	staticex stat=new staticex();
	staticex.staticMethod2();}
static
{
	staticMethod();
	System.out.println("third static block");}
public static void staticMethod()
{
	System.out.println("static method");}
public static void staticMethod2()
{
	System.out.println("static method 2");
}
}