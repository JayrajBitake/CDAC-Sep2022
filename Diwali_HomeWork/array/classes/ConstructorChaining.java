class ConstructorChaining{

ConstructorChaining(){
System.out.println("This is default Constructor");
}
ConstructorChaining(int a){
System.out.println("This is 1 argument Constructor"+a);
}

ConstructorChaining(int a,double b,String s){
System.out.println("This is 3 argument Constructor"+a+" "+b+" "+s);
}
public static void main(String args[]){
ConstructorChaining c=new ConstructorChaining();
ConstructorChaining c1=new ConstructorChaining(5);
ConstructorChaining c2=new ConstructorChaining(1,3.33,"Hello");

}
}