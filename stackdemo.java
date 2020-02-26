import java.util.*;
public class stackdemo 
{
public static void main(String args[]) 
{
	Stack s=new Stack();
	s.push("patrick");
	s.push("James");
	s.push("Mike");
	s.push("Chris");
	s.push("Frank");
	
	System.out.println("Stack elements:"+s);
	System.out.println("First element:" +s.peek());
	System.out.println("stack elements:"+s);
	System.out.println("poping out"+s.pop());
	System.out.println("stack elements"+s);
	s.push("java");
	System.out.println("after adding"+s);
	System.out.println("popping out"+s.pop());
	System.out.println("stack elements:"+s);
	System.out.println("First element:" +s.peek());
	Enumeration e=s.elements();
	System.out.println("elements are:");
	while(e.hasMoreElements())
	{
		System.out.println(e.nextElement());
	}
		
}
}
