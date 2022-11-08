import java.util.*;
class Array2ArrayList{
public static void main(String args[]){
int arr[]={1,2,3,4,5};
List<Integer> al=new ArrayList<Integer>();
 //List al = Arrays.asList(arr);
 for(int x:arr){
	 al.add(x);
 System.out.println(al);
 }
System.out.println("Array converted to ArrayList");






}
}