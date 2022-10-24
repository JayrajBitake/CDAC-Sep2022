interface Shape{
	public void area(double r);
	public void draw();
	//public void rotate();
	public void move();
	
	
}
class Circle implements Shape{
	
	public void area(double r) {
		double a =3.14*r*r;
		System.out.println("Area of Circle is: "+a);
		
	}
	public void draw(){
		System.out.println("Circle drawn");
	}
	
	public void move() {
		double  r=5.5;
		System.out.println("Area of circle after Moving");
		area(r);
		
		
	}
	
	
}
class Rectangle implements Shape{
	public void area(double l) {
		double b=1.33;
		double a =l*b;
		System.out.println("Area of Rectangle is: "+a);
		
		
	}
	public void draw(){
		System.out.println("Rectangle drawn");
	}
	
	public void move() {
		double l=3.3;
		double b=2.44;
		System.out.println("Area of Rectangle after moving  is:");
		area(l);
	}
	
	
}

public class ShapeDemo {

	public static void main(String[] args) {
		Circle c= new Circle();
		c.draw();
		c.area(2);
		
		c.move();
		Circle c1= new Circle();
		Rectangle r=new Rectangle();
		r.draw();
		r.area(2);
		r.move();
		
		Rectangle r1=new Rectangle();
		r1.draw();
		r1.area(24);
		
		
		
	}

}
