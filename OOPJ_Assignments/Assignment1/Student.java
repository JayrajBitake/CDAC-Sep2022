class Student{
String name;
int m1,m2,m3;
double avg;
void setValues(int m1,int m2,int m3){
this.m1=m1;
this.m2=m2;
this.m3=m3;


}
double avg(){
double avg=(m1+m2+m3)/3;
this.avg=avg;
return avg;

}
void print(){
System.out.print("Avg is: "+avg);
}

public static void main(String args[]){

Student s=new Student();
s.setValues(1,2,3);
s.avg();
s.print();
}


}