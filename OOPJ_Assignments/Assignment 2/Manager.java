class Account {
int accountNo;
String holderName;
double balance;

Account(int an,String hn,double bal)
{
this. accountNo=an;
this.holderName=hn;
this.balance=bal;

}

}

class SavingsAccount extends Account
{
double intrestRate;
int calculateYearlyIntrest()
{

}

}

class CurrentAccount extends Account{
	
}

class Manager{
public static void main(String args[]){
Current a=new Account(123,"abc",20000.00);
 
}
}