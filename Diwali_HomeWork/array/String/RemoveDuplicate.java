class RemoveDuplicate{
public static void main(String args[]){
String s="bananas";
char string[]=s.toCharArray();
System.out.println(s);
char arr[]=new char[10];
for(int i=0;i<string.length;i++){
	int j;
	for(j=0;j<string.length;j++)
	{
	if(string[i]==string[j])
	{
		break;
		
	
	}
}
if(i==j){
	arr[i]=string[i];
}
}

System.out.println("String after removing duplicate characters");
for(int i=0;i<string.length;i++)
{
	System.out.print(arr[i]);
}



}

}