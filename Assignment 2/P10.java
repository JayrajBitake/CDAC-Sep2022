class P10{
public static void main(String args[]){
int i,j;
int a=64;
for(i=5;i>0;i--){
for(j=1;j<i;j++){
System.out.print(" ");
}
for(j=i;j<=5;j++){
System.out.print((char)(a+j)+" ");

}
System.out.println(" ");
}


}
}