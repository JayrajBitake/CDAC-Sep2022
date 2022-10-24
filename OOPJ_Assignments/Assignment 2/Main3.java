class Person
{
int age,dateOfBirth;
double weight,height;
String addresss;
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(int dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public double getWeight() {
	return weight;
}
public void setWeight(double weight) {
	this.weight = weight;
}
public double getHeight() {
	return height;
}
public void setHeight(double height) {
	this.height = height;
}
public String getAddresss() {
	return addresss;
}
public void setAddresss(String addresss) {
	this.addresss = addresss;
}

	}
class Employee extends Person{
	double salary;
	int dateOfJoining,experience;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(int dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	
	
}
class Student extends Person{
	
	int rollNo;
	String listOfSubject;
	double marks;
	Student(){
		
		
	}
	
	void calculateGrade(double marks) {
		if(marks>80) {
			System.out.println("A grade");
		
		}
		else if(marks>30) {
			System.out.println("B grade");
		}
		else
			System.out.println("Fail");
			
	}
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getListOfSubject() {
		return listOfSubject;
	}
	public void setListOfSubject(String listOfSubject) {
		this.listOfSubject = listOfSubject;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	void add(int age,String dateOfBirth,double weight,double height,String address,double marks,int rollNo,String  listOfSubject) {
		System.out.println("Student Details:");
		System.out.println("Age:"+age+"\n"+"Date of Birth: "+dateOfBirth+"\n"+"Weight kg: "+weight+"\n"+"Height:"+height+"\n"+"Address: "+address+"\n"+"Marks:"+marks+"\n"+"Roll No:"+rollNo+"\n" +"Subject"+listOfSubject);
	}
	
}
class Technician extends Employee{
	
	
}
class Professor extends Employee
{
	String courses,listOfAdvics;

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}

	public String getListOfAdvics() {
		return listOfAdvics;
	}

	public void setListOfAdvics(String listOfAdvics) {
		this.listOfAdvics = listOfAdvics;
	}
	void add(int age,String dateOfBirth,double weight,double height,String address,double salary,String dateOfJoining,double experience,String courses,String listOfAdvics) {
		System.out.println("Employe Details:");
	System.out.println("Age:"+age+"\n"+"Date of Birth: "+dateOfBirth+"\n"+"Weight kg: "+weight+"\n"+"Height:"+height+"\n"+"Address: "+address+"\n"+"Salary Rs: "+salary+"\n"+"Date of Joining DD/MM/YYYY:"+dateOfJoining+"\n"+"Experince years: "+experience+"\n"+"Courses:"+courses+"\n"+"List odf advise:"+ listOfAdvics);
		
		
	}
}







public class Main3 {

	public static void main(String[] args) {
		Professor p =new Professor();
		p.add(53,"2/11/1996",56.3,5.5,"ABC0",200000.0,"12/03/2022",3.5,"JAVA","asdfghjkjkl");
		Student s = new Student();
		s.add(53,"2/11/1996",56.3,5.5,"ABC0",50,12,"Algebra");
		s.calculateGrade(50);
		
	}

}
