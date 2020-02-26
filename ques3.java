
public class ques3 {
	public static void main(String args[])
	{
	Float f=new Float("12");
	switch(f)   //compilation error
	{
	case 12:System.out.println("twelve");
	case 0: System.out.println("zero");
	default: System.out.println("default");
	}
}
}