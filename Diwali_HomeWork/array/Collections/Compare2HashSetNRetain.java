import java.util.*;
class Compare2HashSetNRetain{
public static void main(String args[]){
Set<Integer> set1=new HashSet<>();
set1.add(1);
set1.add(2);
set1.add(3);
set1.add(4);
System.out.print(set1);
System.out.println();
Set<Integer> set2=new HashSet<>();
set2.add(1);
set2.add(22);
set2.add(33);
set2.add(4);
System.out.print(set2);
System.out.println();
System.out.println("Comparing set & retaining common elements: ");
set1.retainAll(set2);
System.out.print(set1);
}





}