import java.util.*;
class Exer10
{
public static void main(String args[])
{
ArrayList<String> a=new ArrayList<String>();
a.add("Sunday");
a.add("Monday");
a.add("Tueday");
a.add("Wednesday");
a.add("Thursday");
a.add("Friday");
a.add("Saturday");
for(String o:a)
{
System.out.println(o);
}
System.out.println("Size of collection is "+ a.size());
String[] qw=new String[7];
for(int i=0;i<7;i++)
{
qw[i]=a.get(i);
}
for(int i=0;i<7;i++)
{
System.out.println(qw[i]);
}
}
}