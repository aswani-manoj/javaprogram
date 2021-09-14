class Product{
int pcode;
String pname;
double price;
String lowestprice(Product p1,Product p2,Product p3){
if(p1.price<p2.price&&p1.price<p3.price)
 {
 return p1.pname;
 }
else if(p2.price<p1.price&&p2.price<p3.price)
 {
 return p2.pname;
 }
else
 {
 return p3.pname;
 }
 }
void val(int c,String n,double p){
pcode=c;
pname=n;
price=p;
}
}
class ProductPrice{
public static void main(String args[]){
Product p1=new Product();
Product p2=new Product();
Product p3=new Product();
String lprice;
p1.val(101,"lexi",5);
p2.val(102,"pinpoint",10);
p3.val(103,"renolds",7);
lprice=p1.lowestprice(p1,p2,p3);
System.out.println("The product with lowest price is "+lprice);
}
}
