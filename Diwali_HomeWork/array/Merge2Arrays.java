class Merge2Arrays{
public static void main(String args[])
{
int arr[]={1,2,3};
int arr1[]={2,2,2,2,2,2,2,2};
int arr2[]=new int[13];
int i=0,j=0;
System.out.println("Array elements are:");
System.out.println("");
for(i=0;i<arr.length;i++)
{
System.out.print(arr[i]+" ");

}
System.out.print(arr.length);

for(i=0,j=0;i<arr.length;i++,j += 2){

arr2[j]=arr[i];


}
for(i = 0, j= 1; i < arr2.length; i++, j += 2)  
        arr2[j] = arr1[i];  







}









}