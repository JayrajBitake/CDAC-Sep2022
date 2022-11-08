class NonRepeated{
public static void main(String args[]){
String s="Hello";
System.out.println(s);
char c[]=s.toCharArray();
int i=0,j=0;
for(i=0;i<c.length;i++){
boolean res=true;
for(j=0;j<c.length;j++)
{
if(i!=j && c[i]==c[j] ){
res=false;
break;
}
}
if (res) {
    System.out.println("The first non repeated character in String is: " + c[i]);
    break;
}
}
}



}