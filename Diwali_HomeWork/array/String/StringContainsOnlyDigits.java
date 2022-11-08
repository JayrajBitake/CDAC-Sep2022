class StringContainsOnlyDigits{
public static void main(String args[]){
String s="212345678W0";
boolean res=s.matches("[0-9]+");
if(res){
System.out.println("String Contains only Digits" );
}
else
System.out.println("String Contains both  Digits & Characters" );
}
}