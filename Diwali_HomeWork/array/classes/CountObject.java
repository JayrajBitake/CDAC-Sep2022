class CountObject{
static int count=0;
CountObject(){
count=count+1;
}
public static void main(String args[]){
CountObject ob1=new CountObject();
CountObject ob2=new CountObject();
CountObject ob3=new CountObject();
System.out.print("Total Number of Objects: " + count);  
}
}