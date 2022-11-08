class Outer{
void print(){
System.out.println("This outer class function callrd from inner class");
}
class Inner{
void display(){
Outer o =new Outer();
o.print();
}
}
}
class InnerClassRef{
public static void main(String args[]){
	Outer O =new Outer();
Outer.Inner io=O.new Inner();
io.display();

}

}
