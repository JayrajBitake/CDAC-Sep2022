class AverageOf3No
{
static void avg(int arr[])
	{
	int i;
	int l=arr.length;
	int arr2[]=new int[l-2];
	for(i=0;i<l-2;i++)
		{
		 	arr2[i]=(arr[i]+arr[i+1]+arr[i+2])/3;
		}
	for(int x:arr2)
			{
			System.out.print(x+" ");
			
			}
		
	}
public static void main(String args[])
		{
		int arr[]={5,14,35,89,140};
		avg(arr);
		
		}
















}