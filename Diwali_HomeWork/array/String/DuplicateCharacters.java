class DuplicateCharacters{
public static void main(String args[]){
String s ="Java";
  char string[] = s.toCharArray();  
for(int i=0;i<string.length;i++){
	int count = 1;  
for(int j=i+1;j<string.length;j++){
	if(string[i]==string[j])
count++;
}
if(count>1)
	 System.out.println(string[i]);  
}

}

}