import java.util.*;
class HashsetIterator{
public static void main(String args[]){
Set<String> set= new HashSet<String>();
set.add("A");
set.add("B");
set.add("C");
set.add("D");
System.out.println(set);
Iterator<String> i=set.iterator();
System.out.print("Iterator output: ");
while(i.hasNext()){
	System.out.print(i.next()+" ");
}


System.out.println();
set.clear();
System.out.println(set);
}
}