class Parent{
Parent(int x,int y)
{
System.out.println("This is parent class");
int z=x+y;
System.out.println(z);


}
}
class SuperClassIntialize extends Parent{

SuperClassIntialize(){

super(1,4);
System.out.println("This is child class");
}
public static void main(String args[]){
SuperClassIntialize s =new SuperClassIntialize();
}

}