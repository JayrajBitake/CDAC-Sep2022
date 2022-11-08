import java.util.*;
class Colours{
public static void main(String args[]){
List<String> al= new ArrayList<>();
al.add("Red");
al.add("Blue");
al.add("Green");
al.add(0,"Orange");
al.add(3,"yellow");
System.out.println("Element at index 3 is: "+al.get(3));
System.out.println("Element at index 1 is: "+al.get(1));
System.out.println("Elements in arraylist are:");

for(String s:al){
System.out.println(s+" ");
}
Collections.sort(al);
System.out.println("Elements in arraylist after sorting are:");

for(String s:al){
System.out.println(s+" ");
}
Collections.reverse(al);
Collections.swap(al,0,4);
System.out.println("Elements in arraylist after reversing & swapping are:");
for(String s:al){
System.out.println(s+" ");
}

}

}