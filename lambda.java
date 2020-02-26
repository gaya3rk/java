import java.util.*;
import java.util.stream.*;

//lambda expression with argument

//@FunctionalInterface
//interface MyFunctionalInterface{
	//public String sayHello(String x;
//}

public class lambda {
	public static void main(String args[])
	{
		List<String> list=new ArrayList<String>();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		list.add("ddd");
		//list.forEach((names)->{System.out.println(names);});
		//MyFunctionalInterface msg= (name)-> {
		//	return name;
		//};
		//System.out.println(msg.sayHello("gayathri"));
		/*list
		.stream()
		.filter(s->s.startsWith("c"))
		.map(String::toUpperCase)
		.sorted()
		.forEach(System.out::println);*/
		Stream.of("a1","a2","a3")
		.findFirst()
		.ifPresent(System.out::println);
		Arrays.stream(new int[] {1,2,3})
		.map(n->2*n+1)
		.average()
		.ifPresent(System.out::println);
	}

}
