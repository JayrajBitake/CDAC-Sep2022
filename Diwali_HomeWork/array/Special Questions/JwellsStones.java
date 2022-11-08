class JwellsStones
{
public static void main(String args[])
	{
	String s="ayopd";
	String jw="AYOPD";
	char ch1[]=s.toCharArray();
	char ch2[]=jw.toCharArray();
	int count=0;
	for(int i=0;i<ch2.length;i++)
		{
		for(int j=0;j<ch1.length;j++)
		{
		
		if(ch1[i]==ch2[i])
		{
		count++;
		}
		}
		}
System.out.print(count);		
	
	}


}