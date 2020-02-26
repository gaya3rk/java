//7.Write a program to accept an alphabet and display whether its a vowel or consonant

import java.util.Scanner; 
class seven
{
public static void main(String[] args)
{
System.out.println("Enter a letter");
Scanner inp=new Scanner(System.in);
char c=inp.next().charAt(0);
if((c=='a')||(c=='e')||(c=='i')||(c=='o')||(c=='u'))
System.out.println("Its a vowel");
else
System.out.println("Its a consonant");
}
}