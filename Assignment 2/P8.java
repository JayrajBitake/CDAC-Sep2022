import java.util.Scanner;
class P8{
public static void main(String args[]){
int i,j;int r=5;
//Scanner sc=new Scanner(System.in);
//System.out.print("Enter Number of rows: ");
//r=sc.nextInt();
for(i=5;i>0;i--){
for(j=1;j<i;j++){
System.out.print(" ");
}
for(j=i;j<=5;j++){
System.out.print(j+" ");

}
System.out.println(" ");
}
}

}