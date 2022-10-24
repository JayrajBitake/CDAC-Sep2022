import java.util.*;
class Book{
String title,publisher;
int pages;
double price;
//String authors[] = new String[5];
Book(String title,String publisher,int pages,double price, String author){

this.title=title;
this.publisher=publisher;
this.pages=pages;
this.price=price;
this.authors=authors;
}


}
class Library{
	int i,j;
String listOfBooks[]= new String[5];

 void addBook()
 {
	 Scanner s=new Scanner(System.in);
 System.out.println("Enter the books to be added");
	 for(i=0;i<listOfBooks.length-1;i++){
	 listOfBooks[i]=s.nextLine();
	 }
 }
	
	
//System.out.println(listOfBooks[0]);



void remove()
{
	System.out.println("Enter the book no to be removed:");
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	for( i=x-1;i<listOfBooks.length-1;i++)
	{

		
			listOfBooks[i]=listOfBooks[i+1];

		
		
	}
}
	void print()
	{
	for(int j=0;j<listOfBooks.length-2;j++){
			
			System.out.println(listOfBooks[j]);
		}	
		
		
		
	}





public static void main(String args[])
{
	String authors[]={"abc","xyz"};
Book b=new Book( "Wings of fire","ABC",100,225.55,"abc");
Library l = new Library();
l.addBook();
l.remove();
l.print();



}


}