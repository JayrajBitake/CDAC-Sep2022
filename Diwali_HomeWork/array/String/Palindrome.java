import java.util.*;
class Palindrome{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter any String");
String s=sc.nextLine();
String reverse="";
for(int i=s.length()-1;i>=0;i--){
reverse = reverse + s.charAt(i);
}
if (s.equals(reverse))
         System.out.println("Entered string is a palindrome.");
      else
         System.out.println("Entered string is not a palindrome.");





}


}