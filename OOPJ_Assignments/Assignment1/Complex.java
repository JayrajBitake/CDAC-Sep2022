class Complex{
int realPart,imaginaryPart;
Complex(){
}
Complex(int rp,int ip){
this.realPart=rp;
this.imaginaryPart=ip;
}

static Complex add(Complex n1,Complex n2){
Complex ans = new Complex();
ans.realPart=n1.realPart+n2.realPart;
ans.imaginaryPart=n1.imaginaryPart+n2.imaginaryPart;
return ans;


}
static Complex mul(Complex n1,Complex n2){
Complex ans = new Complex();
ans.realPart=n1.realPart*n2.realPart;
ans.imaginaryPart=n1.imaginaryPart*n2.imaginaryPart;
return ans;
}

void print(){
System.out.print(this.realPart+" +"+this.imaginaryPart+"i");

}
public static void main(String args[]){

Complex c=new Complex(2,3);
Complex b=new Complex(2,3);
Complex ans=add(c,b);
System.out.println("Addition is: ");
ans.print();
System.out.println();
Complex res=mul(c,b);
System.out.println("Multiplication is: ");
res.print();





}

}