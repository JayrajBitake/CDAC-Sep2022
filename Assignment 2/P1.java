import java.util.Scanner;
class P1{
public static void main(String args[]){
int i,j,r,c;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Number of rows: ");
 r=sc.nextInt();
 //System.out.println("Enter Number of rows: ");
 //c=sc.nextInt();
for(i=1;i<=r;i++){
for(j=1;j<=i;j++){
System.out.print(j+" ");

}
System.out.println(" ");
}


}
}