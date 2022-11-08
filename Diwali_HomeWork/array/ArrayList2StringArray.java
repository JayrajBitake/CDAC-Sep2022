import java.util.*;
class ArrayList2StringArray{
public static void main(String args[]){
List<String> al=new ArrayList<>();
al.add("Hello");
al.add("JB");
System.out.println(al);

String k[] = al.toArray(new String[al.size()]);
for (String str : k) {
 
            // Printing the elements in above array
            System.out.println(str);
}

}
}