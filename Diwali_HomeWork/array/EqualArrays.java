class EqualArrays{
public static void main(String args[]){
int arr[]={1,2,3,4,5,6,7,8,9};
int arr1[]={1,2,3,4,5,6,7,8,0};
int i=0;
int j=0;
boolean result=true;
int a=arr.length;
int b=arr1.length;
if(a==b){
for(i=0;i<arr.length;i++){
if(arr[i]!=arr1[i]){
	result =false;
}
}
if(result==true)
System.out.println("Equal arrays");
else
System.out.println(" Not Equal arrays");


}
else{
System.out.println("Array lengths different");	
	
}

}
}