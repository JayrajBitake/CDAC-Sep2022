interface Shape{
void print();
//void perimeter();
}
class Circle implements Shape{
public void print(){
System.out.println("This is a Circle");

}

}
class Rectangle implements Shape{
public void print(){
System.out.println("This is a Rectangle");

}
}
class ShapeDemo{

public static void main(String args[]){
Circle c=new Circle();
c.print();
Rectangle r=new Rectangle();
r.print();



}

}
