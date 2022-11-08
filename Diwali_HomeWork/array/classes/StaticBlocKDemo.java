class StaticBlocKDemo{
	static void  print(){
System.out.println("This is static method 1");
}
	StaticBlocKDemo(){
System.out.println("This is constructor");
}
static {
System.out.println("This is static block 1");

}


static {
System.out.println("This is static block 2");

}

public static void main(String args[]){
StaticBlocKDemo s =new StaticBlocKDemo();
print();

}


}