import java.util.*;
class SeriesGenerator{
public static void main(String args[]){
int i,n;
Scanner sc=new Scanner(System.in);
//System.out.println("Enter no upto which u want to generate series");
//n=sc.nextInt();
int arr[]={1,2,3,4,5,6};
int arr2[]=new int[6];
for(i=0;i<arr.length;i=i+2){
	arr2[i]=(int)(Math.pow(arr[i],3));
//System.out.print(arr[i]+",");
}

for(i=1;i<arr.length;i=i+2){
	arr2[i]=(int)(Math.pow(arr[i],2));
//System.out.print(arr[i]+",");
}

for(i=0;i<arr2.length;i++){
	
System.out.print(arr2[i]+",");
}
}


}