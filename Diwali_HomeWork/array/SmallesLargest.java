class SmallesLargest{
public static void main(String args[]){

int arr[]={111,2,3,4,9,6,7,8,9,10};
int s=arr[0],m=0;
System.out.println("array elements are: ");
for(int i=0;i<arr.length;i++){
System.out.print(arr[i]+" ");
}
System.out.println();
for(int i=0;i<arr.length;i++){
if(arr[i]>m){
	m=arr[i];
}

if(arr[i]<s){
s=arr[i];
}


}
System.out.print("Largest element is : "+m);
System.out.print("Smallest element is : "+s);
}
}
