class Test{
 int x=10;
 static int y=70;
public static void main(String args[]){
// System.out.println(x); non-static variable x cannot be referenced from a static context
System.out.println(y);
Test t =new Test();
System.out.println(t.x);// static variable only accesible after object creation 


}

}