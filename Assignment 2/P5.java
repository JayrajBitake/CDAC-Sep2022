import java.util.Scanner;
class P5{
public static void main(String args[]){
char i,j;int r;
Scanner sc=new Scanner(System.in);
System.out.print("Enter Number of rows: ");
r=sc.nextInt();
for(i='A';i<='E';i++){
for(j='A';j<=i;j++){
System.out.print(i+" ");

}
System.out.println(" ");
}


}
}