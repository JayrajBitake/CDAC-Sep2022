class EqualityOfTwoArrays{
public static void main(String args[]){

int arr[]={1,2,3,4,9,6,7,8,9,10};
int arr1[]={1,2,3,4,5,6,7,8,9,11};
for(int i=0;i<arr.length;i++)
{
if(arr[i]==arr1[i]){
System.out.println(arr[i]+"=="+arr1[i]);
}
else{
	System.out.println("Arrays are not same");
	break;
}
}


}
}