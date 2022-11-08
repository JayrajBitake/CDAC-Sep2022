import java.util.*;
class HashMapDemo{
public static void main(String args[]){
HashMap<Integer,String> hm=new HashMap<>();
hm.put(1,"a");
hm.put(2,"b");
hm.put(3,"c");
hm.put(4,"d");
hm.put(4,"llll");

System.out.print(hm);
System.out.println();
System.out.println("Size of HashMap is: "+hm.size());
System.out.println("Element of HashMap  at key 4 is: "+hm.get(4));
boolean res =hm.isEmpty();
 System.out.println("Is HashMap Empty: "+res);
 System.out.println("HashMap Cleared: ");
hm.clear();

boolean res1=hm.isEmpty();
 System.out.print("Is HashMap Empty: "+res1);

}






}