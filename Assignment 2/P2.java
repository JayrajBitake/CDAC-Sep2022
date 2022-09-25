import java.util.Scanner;
class P2{
public static void main(String args[]){
int i,j,r;
int a=65;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Number of rows: ");
r=sc.nextInt();
for(i=0;i<=r;i++){
for(j=0;j<=i;j++){
System.out.print((char)(a+j)+" ");

}
System.out.println(" ");
}


}
}