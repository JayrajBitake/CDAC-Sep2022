class Outer{
private int n=100;
class Inner
{
public int print()
{

System.out.println("This is inner class");

System.out.println("This is outer class number"+n);
return n;

}


}
void display_Inner(){ 
	Inner i =new Inner();//create inner class object
	i.print();	
	
}
}
class InnerDemo{
public static void main(String args[]){
Outer o =new Outer();
o.display_Inner();

Outer.Inner oi=o.new Inner();  // Instantiating the inner class
 System.out.println(oi.print());

}
}