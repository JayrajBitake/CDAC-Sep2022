import java.util.Scanner;
class P9{
public static void main(String args[]){
int i,j;int r;
int a=64;
Scanner sc=new Scanner(System.in);
System.out.print("Enter Number of rows: ");
r=sc.nextInt();
for(i=1;i<r;i++){
for(j=r-i;j>1;j--){
System.out.print(" ");
}
for(j=1;j<=i;j++){
System.out.print((char)(a+j)+" ");

}
System.out.println(" ");
}
}

}