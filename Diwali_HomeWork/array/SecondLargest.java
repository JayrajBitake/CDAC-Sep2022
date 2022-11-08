class SecondLargest{
public static void main(String args[]){
int arr[]={1,2,3,44,77};
int l=0,sl=0;
for(int i=0;i<arr.length;i++){
if(arr[i]>l){
l=arr[i];
}
}
for(int i=0;i<arr.length;i++){
if(arr[i]>sl && arr[i]<l){
sl=arr[i];
}
}
System.out.println("Second largest elememt is: "+sl);

}


}