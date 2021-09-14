class Complex{
int real;
int img;
void add(int a,int b,int c,int d){
real=a+c;
img=b+d;
System.out.println("complex numbersafter addition is:"+real+"+"+img+"i");
}
}
class Complexadd{
public static void main(String args[]){
Complex c=new Complex();
c.add(3,4,5,6);
}
}