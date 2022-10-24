import java.util.*;
class Room{
double height,width,breadth;
double volume(double height,double width,double breadth){
this.height=height;
this.width=width;
this.breadth=breadth;
double v=(height*breadth*width);
System.out.println("Volume of room is: "+v);
return v;


}
}
class RoomDemo{


public static void main(String args[]){
Room r=new Room();
r.volume(2.2,3.2,3.3);


}
}


