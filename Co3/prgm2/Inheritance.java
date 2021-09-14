import java.util.Scanner;
class Employee
     {
      int empid;
      String name;
      int salary;
      String address;
      Employee()
        {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the empid:");
         empid=sc.nextInt();
         System.out.println("enter the name:");
         name=sc.next();
         System.out.println("enter the salary:");
         salary=sc.nextInt();
         System.out.println("enter the address:");
         address=sc.next();
        }
}
class Teachers extends Employee
      {
       String department;
       String subject;
       Teachers()
        {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the department:");
         department=sc.next();
         System.out.println("enter subject taught:");
         subject=sc.next();
        }
void display()
       {
        System.out.println("empid:"+super.empid);
        System.out.println("name:"+super.name);
        System.out.println("salary:"+super.salary);
        System.out.println("address:"+super.address);
        System.out.println("department:"+department);
        System.out.println("subject taught:"+subject);
        System.out.println();
       }
}
public class Inheritance
   {
    public static void main(String args[])
     {
      int n;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number of objects:");
      n=sc.nextInt();   
      Teachers obj[]=new Teachers[n];
      for(int i=0;i<n;i++)
        {
          obj[i]=new Teachers();
        }
      for(int i=0;i<n;i++)
        {
          obj[i].display();
        }
   }
 }
