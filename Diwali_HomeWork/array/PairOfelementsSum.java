class PairOfelementsSum
{
static void sum(int arr[],int n)
	{
	int i;
	int l=arr.length;
	for(i=0;i<l-1;i++)
		{
		 	if(arr[i]+arr[i+1]==n)
				{
				System.out.println("pair found element at position "+i+" && "+(i+1) +" equal to "+ n);
				}
		}
		
	}
public static void main(String args[])
		{
		int arr[]={5,5,3,5};
		sum(arr,8);
		
		}
}