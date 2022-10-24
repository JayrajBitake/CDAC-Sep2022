class Automobile{
 String make,type;
double maxSpeed,price,mileage,registrationNumber;
Automobile(){
}
Automobile( String make,String type,double maxSpeed,double price,
double mileage,double registrationNumber){
this.make=make;
this.type=type;
this.maxSpeed=maxSpeed;
this.price=price;
this.mileage=mileage;
this.registrationNumber=registrationNumber;
 }
 
 public String getMake()
	{
	return make;
	}
  public void setMake(String make)
        {
            this.make= make;
        }

 public String getType()
	{
	return type;
	}
  public void setType(String type)
        {
            this.type= type;
        }
		 public double maxSpeed()
	{
	return maxSpeed;
	}
  public void setMaxspeed(double maxSpeed)
        {
            this.maxSpeed= maxSpeed;
        }
		public double getMileage()
	{
	return mileage;
	}
  public void setMileage(double mileage)
        {
            this.mileage= mileage;
        }
		public double getPrice()
	{
	return price;
	}
  public void setPrice(double price)
        {
            this.price= price;
        }
public String toString()
        {
           return ("Manufacturer:"+make+"\n"+
                   "type:"+type+"\n"+"Maximum Speed:"+maxSpeed+"\n"+"Price:"+price+
                   "\n");
        }		
		
		
		
		
		
		
		
		
}	

class Car extends Automobile{
int noOfDoors,seatingCapacity;
public Car(){}

public Car(String make,String type,double maxSpeed,double price,
double mileage,double registrationNumber,int noOfDoors,int seatingCapacity)
{
super(make,type,maxSpeed,price,mileage,registrationNumber);
this.noOfDoors=noOfDoors;
this.seatingCapacity=seatingCapacity;
}
public int getNoOfDoors()
	{
	return noOfDoors;
	}
  public void setDoors(int noOfDoors)
        {
		this.noOfDoors=noOfDoors;
           
        }
		public int getseatingCapacity()
	{
	return seatingCapacity;
	}
  public void setDoor(int seatingCapacity)
        {
		
            this.seatingCapacity= seatingCapacity;
        }
		public String toString()
    {
        return ("Make:"+make+"\n"+
               "type:"+type+"\n"+"Maximum Speed:"+maxSpeed+"\n"+"Price:"+price+
               "\n"+"Mileage:"+mileage+"\n"+"Doors:"+noOfDoors+"\n"+"Seating capacity:"+seatingCapacity);
    }
		


}
class Truck extends Automobile{
	double capacity;
	String hoodType;
	int noOfWheels;
	Truck( String make,String type,double maxSpeed,double price,double mileage,double registrationNumber,double capacity,int noOfWheels,String hoodType){
	super(make,type,maxSpeed,price,mileage,registrationNumber);
	this.capacity=capacity;
	this.noOfWheels=noOfWheels;
	this.hoodType=hoodType;
}
double getCapacity(){
	return capacity;
}
void setCapacity(double capacity){
	this.capacity=capacity;
}
	int getnoOfWheels(){
		return noOfWheels;
	}
	void setNoOfWheels(int noOfWheels){
		this.noOfWheels=noOfWheels;
	}
	String getHoodtype(){
		return hoodType;
	}
	void setHoodtype(String hoodType){
		this.hoodType=hoodType;
	}
	public String toString(){
	return ("Make:"+make+"\n"+
               "type:"+type+"\n"+"Maximum Speed:"+maxSpeed+"\n"+"Price:"+price+
               "\n"+"Mileage:"+mileage+"\n"+"noOfWheels"+noOfWheels+"\n"+"Capacity"+capacity+"\n"+"Hoodtype:"+hoodType);
	}
}

 public class Main4
    {


        public static void main(String[] args)
        {
            Car C=new Car("Tata","sedan",220,12000.0,12.5,5.33,4,4);
           Truck T=new Truck("Mahindra","Truck",60,190000.0,5.000,1.23644,1000,10,"Open");
		   System.out.println("Car:");
            System.out.println(C.toString());
            System.out.println();
			 System.out.println("Truck:");
            System.out.println(T.toString());

        }


    }