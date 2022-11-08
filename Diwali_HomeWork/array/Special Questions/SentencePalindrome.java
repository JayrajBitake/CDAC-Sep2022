import java.util.*;
class SentencePalindrome
{
 static boolean palindrome(String s)
	{
	if(s.isEmpty())
		return true;
		
	String s1=s.toUpperCase();
	s1=s1.replaceAll("[^a-zA-Z0-9]","");
	System.out.println(s1);
	StringBuilder str=new StringBuilder(s1);
	
	str.reverse();
	System.out.println(str);
	
	if(s1.equals(str))
	return true;

return false;
	}
public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	String s=sc.nextLine();
	boolean res=palindrome(s);
	System.out.println(res);
	if(palindrome(s))
		System.out.println("Palindrome");
	else
		System.out.println(" Not Palindrome");
	
	
	
	}




}