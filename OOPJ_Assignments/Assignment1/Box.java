class Box{
double height,width,breadth;
Box(double h,double w,double b){

this.height=h;
this.width=w;
this.breadth=b;
}
double getVolume(){
double volume=(height*width*breadth);
System.out.println("Volume: "+volume);
return volume;

}
double  getArea(){
double sa=(2*breadth*width)+(2*breadth*height)+(2*width*height);
System.out.println("Surface area: "+sa);
return sa;

}
public static void main(String args[]){
Box b=new Box(1,2,3);
b.getVolume();
b.getArea();




}



}