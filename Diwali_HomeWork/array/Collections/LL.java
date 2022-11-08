import java.util.*;
class LL{
LinkedList<String> ll =new LinkedList<String>();
ll.add("Hello");
ll.add("Hiii");
ll.add("lllll");
ll.add(3,"Hello");
ll.add(1,"Jayraj");
ll.addFirst("First");
ll.addLast("Last");
		System.out.println(ll);
		for(int i=0;i<ll.size();i++){
		    System.out.println("Element at position "+i+" "+ll.get(i));
		}
		if(ll.contains("Jayraj"))
		{
		    System.out.println("Element present");
		}
		
	}
}
