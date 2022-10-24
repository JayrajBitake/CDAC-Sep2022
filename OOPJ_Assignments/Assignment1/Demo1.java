import java.util.*;
class MathOperation{

static int add(int a,int b){
int sum =a+b;
return sum;
}
static int subtract(int a,int b){
int sub =a-b;
return sub;
}
static int multiply(int a,int b){
int mul =a*b;
return mul;
}
static int power(int a,int b){
int pow =(int)Math.pow(a,b);
return pow;
}




}
class Demo1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter two nos: ");

int a=sc.nextInt();
int b=sc.nextInt();
MathOperation m=new MathOperation();

int x=MathOperation.add(a,b);
int y=MathOperation.subtract(a,b);
int z=MathOperation.multiply(a,b);
int m1=MathOperation.power(a,b);
System.out.println("Addition is: "+x);
System.out.println("Subtraction  is: "+y);
System.out.println("Multiplication is: "+z);
System.out.println("Power is: "+m1);



}


}