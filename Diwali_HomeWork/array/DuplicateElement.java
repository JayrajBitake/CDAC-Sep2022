class DuplicateElement{
public static void main(String args[]){
int arr[]={1,1,2,3,4,5,8,8};
int i=0;
System.out.print("Duplicate Elements in array are: ");
for(i=1;i<arr.length;i++){
if(arr[i-1]== arr[i]){
System.out.print(arr[i]+" ");
}

}




}




}