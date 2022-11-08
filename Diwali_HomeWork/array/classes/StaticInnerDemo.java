class Outer{
 static class Inner{
 void print(){
 System.out.println("This is static inner class");
 }
  }
}
class StaticInnerDemo{
public static void main(String args[]){
Outer.Inner i = new Outer.Inner();
i.print();


}
}