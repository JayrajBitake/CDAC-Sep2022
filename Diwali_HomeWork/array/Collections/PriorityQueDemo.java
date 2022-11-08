import java.util.*;
class PriorityQueDemo{
public static void main(String args[]){
PriorityQueue<Integer> pq=new PriorityQueue<>();
pq.add(1);
pq.add(11);
pq.add(111);
pq.add(111);
pq.add(1111);
pq.add(11111);
System.out.println("Original Priority Queue ");
System.out.print(pq);
System.out.println();
Object[] arr=pq.toArray();
System.out.println("The array is:");
        for (int j = 0; j < arr.length; j++)
            System.out.print(arr[j]+" ");


System.out.println();
System.out.println("After Clearing the Original Priority Queue ");
pq.clear();
System.out.print(pq);
}



}