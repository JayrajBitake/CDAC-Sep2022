class SortArray{
public static void main(String args[]){
int arr[]={9,2,7,8,3,6,4};
int i=0;
int j=0;
int temp=0;
System.out.println("unSorted array is: ");
for(i=0;i<arr.length;i++){
System.out.print(arr[i]+" ");
}
System.out.println();

for(i=0;i<arr.length;i++){
for(j=i+1;j<arr.length;j++){
if(arr[i]>arr[j]){
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}

System.out.println("Sorted array is: ");
for(i=0;i<arr.length;i++){
System.out.print(arr[i]+" ");
}

}
}