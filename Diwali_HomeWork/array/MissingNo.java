class MissingNo{
public static void main(String args[]){
int arr[]={1,2,3,4,5,6,7,8,10};
int total=(10*(10+1))/2;
int sum=0;
for(int i=0;i<arr.length;i++){
sum=sum+arr[i];
}

System.out.println("Missing No is: "+(total-sum));

}


}