import java.util.*;
class Back2OriginalPosition
{
static boolean check(String s)
	{
		char ch[]=s.toCharArray();
		int i=0;
		int U = 0;
        int R = 0;
		for(i=0;i<ch.length;i++)
		{
		if(ch[i]=='U')
			{
		U++;
			}
		else if(ch[i]=='D')
			{
		U--;
			}
		else if(ch[i]=='R')
			{
		R++;
			}
		else if(ch[i]=='L')
			{
		R--;
			}
		}		
		
		
		if(U==0 && R==0)
			{
		return true;
			}
		return false;
	
	}
public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter string");
	String s=sc.next();
	if(check(s))
	System.out.println("True");
	else
	System.out.println("False");
	
	}

}








