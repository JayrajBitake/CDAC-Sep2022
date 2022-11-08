 class FinalDemo{
	 final public static void print(){
		
		System.out.println("This is final method  in base class and cannot be overriden");
		
	}
	
}
final class FinalKeyWord extends FinalDemo{ // this class cannot be inherited because it is made final
	/*final public static void print(){
		
		System.out.println("This is final in child class method and cannot be overriden");
		
	}*/
	
	
final static int x=10;
public static void main(String args[]){
//x=x+1;
System.out.println("x is final & cannot be changed: "+x);

}

}