class ReverseArray{
public static void main(String args[]){

int arr[]={1,2,3,4,9,6,7,8,9,10};
System.out.println("array elements are: ");
for(int i=0;i<arr.length;i++){
System.out.print(arr[i]+" ");
}
System.out.println();
System.out.println("array elements after reversing are: ");
for(int i=arr.length-1;i>=0;i--){
System.out.print(arr[i]+" ");

}
}}