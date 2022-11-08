import java.util.Scanner;
class Main3{
public static void main(String args[]){

int arr[]={1,2,3,4,9,6,7,8,9,10};
System.out.println("array elements are: ");
for(int i=0;i<arr.length;i++){
System.out.print(arr[i]+" ");
}
System.out.println();
Scanner sc= new Scanner(System.in);
System.out.println("Enter No");
int n=sc.nextInt();
for(int i=0;i<arr.length;i++){
for(int j=i;j<arr.length;j++){
if(arr[i]+arr[j]==n && i!=j){
System.out.println("index no "+ i +" + "+j +"\n");
}
}


}








}


}