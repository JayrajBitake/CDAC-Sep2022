class StaticMethodAccess{
static int x=10;
int y=10;
static public void print(){
//System.out.println("This non static variable:"+y); csnnot be accessed because y is non static
System.out.println("This is static variable:"+x);


}
public static void main(String args[]){
 StaticMethodAccess a = new  StaticMethodAccess();
 a.print();

}








}