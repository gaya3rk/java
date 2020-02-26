
public class Exer1
{
public static void main(String args[])
{
	String s="The quick brown fox jumps over the lazy dog";
	System.out.println(s.charAt(12));
	boolean b=s.contains("is");
	System.out.println(b);
	System.out.println(s+" and killed it");
	System.out.println(s.endsWith("dogs"));
	System.out.println(s.equals("The quick brown Fox jumps over the lazy Dog"));
	System.out.println(s.equals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"));
	System.out.println(s.indexOf('a'));
	System.out.println(s.lastIndexOf('e'));
	System.out.println(s.length());
	System.out.println(s.matches("The quick brown Fox jumps over the lazy Dog"));
	System.out.println(s.replace("The", "A"));
	String s1="A quick brown Fox jumps @ over the lazy Dog";
	String str[]=s1.split("@",2);
	for(int i=0;i<str.length;i++)
	{
		System.out.println(str[i]);
	}
	System.out.println(s.toLowerCase());
	System.out.println(s.toUpperCase());
}

}
