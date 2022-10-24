abstract class Publication{
 int noOfPages;
 int price;
 String publisherName;
Publication()
{
	
}
Publication(int noOfPages,int price ,String publisherName)
{
this.publisherName=publisherName;
this.noOfPages=noOfPages;
this.price=price;
}
}

class Book extends Publication{
	Book(int noOfPages,int price ,String publisherName){
		
		
	System.out.println("BOOK DETAILS:Publisher:"+publisherName+",No OF Pages:"+noOfPages+",Price:"+price);	
	}

public String toString(){
return "BOOK DETAILS:Publisher:"+this.publisherName+",No OF Pages:"+this.noOfPages+",Price:"+this.price;
}
	
}


class Journal extends Publication{

	Journal(int noOfPages,int price ,String publisherName){
System.out.println( "JOURNAL DETAILS:Publisher:"+publisherName+",No OF Pages:"+noOfPages+",Price:" +price);

	}
}





class Library
{
public static void main(String Args[])
{
Book b =new Book(122,200,"abc");
Book b1 =new Book(1212,289,"xyz");

//System.out.println(b);
Journal j=new Journal(122,200,"abc");

}
}