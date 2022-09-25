import java.util.Scanner;
class P12{
public static void main(String args[]){
int i,j;int r;
Scanner sc=new Scanner(System.in);
System.out.print("Enter Number of rows: ");
r=sc.nextInt();
for(i=1;i<=r;i++){
for(j=r-i;j>0;j--){
System.out.print(" ");

}
for(j=1;j<=i;j++){
System.out.print(i+" ");
}
System.out.println("");

}}}