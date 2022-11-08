import java.util.*;
class RemoveCharacter{
public static void main(String args[]){

Scanner sc=new Scanner(System.in);
System.out.println("Enter String");
String s=sc.nextLine();
char c[]=s.toCharArray();
System.out.println("Enter character to be removed");
char a=sc.next().charAt(0);

for(int i=0;i<c.length;i++){
	if(c[i]==a){
		c[i]=' ';
		
	}
	
	
}

System.out.println("character removed from string");
for(char x:c)
	System.out.print(x+" ");

}





}