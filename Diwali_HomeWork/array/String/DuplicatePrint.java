class DuplicatePrint{
public static void main(String args[])
{
String s ="Programming";
char string[]=s.toCharArray();
int i=0,j=0;
for(i=0;i<string.length;i++)
{
int count=1;
for(j=i+1;j<string.length;j++){
if(string[i]==string[j])
{
count++;
}

}
if(count>1){
System.out.println(string[i]+" "+count);
}
}



} 




}