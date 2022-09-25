import java.util.Scanner;
class P13{
public static void main(String args[]){
int i,j;int r;
int a=65;
Scanner sc=new Scanner(System.in);
System.out.print("Enter Number of rows: ");
r=sc.nextInt();
for(i=0;i<r;i++){
for(j=r-i;j>0;j--){
System.out.print(" ");

}
for(j=0;j<=i;j++){
System.out.print((char)(i+a)+" ");
}
System.out.println("");

}}}