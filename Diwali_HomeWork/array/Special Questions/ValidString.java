import java.util.*;
import java.lang.*;
class ValidString
{
static boolean check(char s)
	{
		//char c[]=s.toCharArray();
	boolean b1=Character.isUpperCase(s);
	System.out.print(b1);
	if(b1)
	return true;
	for(int i=0;i<s.length();i++)
	{
		
	}
	
	return true;
	
	}
public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	char s=sc.next().charAt(0);
	check(s);
	
	}


}