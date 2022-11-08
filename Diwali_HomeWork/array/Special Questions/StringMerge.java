class StringMerge
{
public static void main(String args[])
	{
	String s1="abc";
	String s2="defwe";
	
	char ch[]=new char[100];
	char c1[]=s1.toCharArray();
	char c2[]=s2.toCharArray();
	//System.out.print(c2);
	 int j=0;
	 int k=0;
	for(int i=1;i<=6;i++)
		{
			
			
			if(i%2==0)
			{
				
				ch[i]=c2[k];
				k++;
			}
			else
			{
				ch[i]=c1[j];
				j++;
			}
			
			
		}
		
		for(char x:ch)
		{
			System.out.print(x);
		}
	
	}


}