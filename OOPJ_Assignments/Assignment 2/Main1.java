abstract class Publication{
	int noOfPages;
	double price;
	String publisherName;
	abstract void  add(int noOfPages,double price,String publisherName);
	
	
	
	
}
class  Book extends Publication{
	
	void add(int noOfPages,double price,String publisherName) 
	{
		System.out.println("Book Added");
	System.out.println("No of pages:"+noOfPages+"\n"+"price:"+price+"\n"+"publisherName:"+publisherName);	
		
	}
}
class Journal extends Publication{

	void add(int noOfPages,double price,String publisherName) 
	{
		System.out.println("Journal Added");
	System.out.println("No of pages:"+noOfPages+"\n"+"price:"+price+"\n"+"publisherName:"+publisherName);	
		
	}
	
}
class Library{
	
	
}
public class Main1 {

	public static void main(String[] args) {
		Publication p=new Book();
		p.add(254,200.56,"Xyz");
		p.add(1000,369.56,"kkkk");
		p.add(2541,2100.56,"loiugfds");
		
		Publication p1=new Journal();
		p1.add(254,200.56,"Xyz");
		p1.add(112,289,"ertyh");

	}

}
