class MethodsInClass{
void method1(){
System.out.println("This is method without parameter &  without return type");

}
double method2(int x,double y){
double c=x+y;
System.out.println("This is method with 2 parameters & return type double"+"x="+x+" y="+y+" c="+c);
return c;
}
 void method3(int x,double y){
double c=x+y;
System.out.println("This is method with 2 parameters &  no return type double"+"x="+x+" y="+y);

}
int method4(){
	int x=10;
System.out.println("This is method without parameter & return type int");
return x;
}

public static void main(String args[]){
 MethodsInClass m=new  MethodsInClass();
 m. method1();
 m. method2(1,3.3);
 m. method3(1,3.3);
 int x= m. method4();
 System.out.println(x);
}





}