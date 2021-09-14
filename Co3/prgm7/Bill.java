import java.util.Scanner;
interface bill_format{
void calculate();
}
class Bill implements bill_format{
      int pid;
      String pname;
      int quandity;
      int price;
      int total;
      public void calculate(){
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter product id:");
          pid=sc.nextInt();
          System.out.println("Enter product name:");
          pname=sc.next();
          System.out.println("Enter product quantity:");
          quandity=sc.nextInt();
          System.out.println("Enter product price:");
          price=sc.nextInt();
          total=quandity*price;
        }
      public void display(){
        System.out.println(pid+"\t"+"\t"+pname+"\t"+quandity+"\t"+"\t"+price+"\t"+"\t"+total);
      }
   public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("order no:");
     int no=sc.nextInt();
     System.out.println("enter the date:");
     String date=sc.next();
     System.out.println("enterthe no of products:");
     int n=sc.nextInt();
     Bill[] b=new Bill[n];
     for(int i=0;i<n;i++)
     {
       b[i]=new Bill();
     }
     for(int i=0;i<n;i++)
      {
       b[i].calculate();
      }
      System.out.println();
      System.out.println("order No:"+no);
      System.out.println();
      System.out.println("Date:");
      System.out.println();
      System.out.println("Product id"+"\t"+"Name"+"\t"+"Quandity"+"\t"+"unit Price"+"\t"+"total");
      for(int i=0;i<n;i++){
        b[i].display();
      }
      int Net_Amount=0;
      for(int i=0;i<n;i++)
       {
        Net_Amount=Net_Amount+b[i].total;
  }
  System.out.println("\t"+"\t"+"\t"+"\t"+"Net Amount:"+Net_Amount);
 }
}