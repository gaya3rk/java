//CHARACTERSTREAM class

import java.io.*;
public class RWfile 
{
public static void main(String args[]) throws Exception
{
	try
	{
		File f=new File("pw.java");
		FileReader fin=new FileReader(new File("abc.txt"));
		FileWriter fout=new FileWriter(f);
		int i=0;
		while((i=fin.read())!=-1)
		{
			fout.write(i);
		}
	fout.close();
	}
	catch(Exception e) {}
	

	//String s="pw4.java";
	//String s1="abc.txt";
	//int i;
	//FileInputStream fis=new FileInputStream(s1);
	//FileOutputStream bw=new FileOutputStream(s,false);
	//fis.skip(5);
	//while((i=fis.read())!=-1)
	//{
		//bw.flush();
		//bw.write(i);
	//}
	//bw.close();
	//fis.close();
}
}
