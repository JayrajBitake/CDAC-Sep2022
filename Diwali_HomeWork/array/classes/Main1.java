abstract class A{
abstract void fun1();
abstract void fun2();
}
class B extends A{
void fun1(){
System.out.println("This is fun1");
}
void fun2(){
System.out.println("This is fun2");
}

}
class Main1{
public static void main(String args[]){
//A a=new A(); cannot be instantaited
B b =new B();
b.fun1();
b.fun2();


}}