class Student{
	String name;
	void setName(String name){
		this.name=name;
		
	}
	String getName(){
		return name;
	}
	
	
	
	
}
class PassByValue{
static int a=10;
static void print(int a){
System.out.println("Initial value of a is: "+a);
a=a+1;
}

 static void Student(Student name){
Student n=name;
	 System.out.println("Initial name  of name is: "+name.getName());
	 n.setName("ABC");
 }
public static void main(String args[]){
System.out.println("value of a after passing  is: "+a);
print(a);
Student s = new Student();
s.setName("XYZ");
Student(s);
System.out.println("value of name after passing  is: "+s.getName());


}



}