class Bank{
double noOfyears=2;
double rate=10;
double priciple=10000;
 class Intrest{
double calIntrest(){
double intrest=(noOfyears*rate*priciple)/100;
return intrest;

}


}


}
class BankDemo{
public static void main(String args[]){
Bank b=new Bank();
Bank.Intrest i=b.new Intrest();
System.out.println("Intrest is:"+i.calIntrest());
}


}