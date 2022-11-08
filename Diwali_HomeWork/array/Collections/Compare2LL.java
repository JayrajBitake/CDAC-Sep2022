import java.util.*;
public class Compare2LL
{
	public static void main(String[] args) {
	    LinkedList<String> ll =new LinkedList<String>();
ll.add("Hello");
ll.add("Hiii");
ll.add("lllll");
ll.set(1,"Jayraaj");

		System.out.println(ll);
 LinkedList<String> ll1 =new LinkedList<String>();		
		ll1.add("kkkk");
ll1.add("Hiii");
ll1.add("lllll");
System.out.println(ll1);
LinkedList<String> ll2 =new LinkedList<String>();	
 for (String e : ll)
ll2.add(ll1.contains(e)?"yes":"No");
System.out.println(ll2);
	}
}
