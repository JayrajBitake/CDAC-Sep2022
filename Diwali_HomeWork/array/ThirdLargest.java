class ThirdLargest
{
public static void main(String args[])
{
int arr[]={1,2,3,4,5,6,7,8,9};
int l=0,sl=0,tl=0;
System.out.println("Array elements are:");
System.out.println("");
for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]+" ");

}

for(int i=0;i<arr.length;i++)
{
if(arr[i]>l)
{
l=arr[i];

}

}
for(int i=0;i<arr.length;i++)
{
if(arr[i]>sl && arr[i]<l)
{
sl=arr[i];

}
}

for(int i=0;i<arr.length;i++)
{
if(arr[i]>tl && arr[i]<sl)
{
tl=arr[i];

}
}

System.out.println("Output: "+tl+" is third largest and "+sl+" is second largest "+l+" is largest");



}
}