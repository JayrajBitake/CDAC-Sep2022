import java.util.*;
class TreeSetDemo{
public static void main(String args[]){
Set<String> t=new TreeSet<>();
t.add("RED");
t.add("GREEN");
t.add("BLUE");
t.add("BLUE");
System.out.print(t);
System.out.println();
Set<Integer> t1=new TreeSet<>();
t1.add(1);
t1.add(22);
t1.add(6);
System.out.print(t1);
System.out.println();
System.out.print("No less than 7 in treeset: ");
for(Integer x:t1){
	if(x<7){
		System.out.print(x+" ");
	}
}


}



}