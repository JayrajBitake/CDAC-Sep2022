import java.util.*;
class BinaryStringSum{
 public static String addBinary(String a, String b) {
    return Integer.toBinaryString(Integer.parseInt(a, 2) + Integer.parseInt(b, 2));
  }


public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Binary String1");
	String s1=sc.next();
	System.out.println("Enter Binary String2");
	String s2=sc.next();
	System.out.println(addBinary(s1,s2) );
	//Integer.toBinaryString(Integer.parseInt(s1, 2) + Integer.parseInt(s2, 2));
	
	
	//int s3= (int)s1^(int)s2;
	//System.out.println(s3);
	
	
	
	
	
	}





}