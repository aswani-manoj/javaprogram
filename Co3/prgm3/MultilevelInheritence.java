import java.util.Scanner;
class Person
     {
      String name;
      String gender;
      int age;
      String address;
      Person()
        {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the name:");
         name=sc.next();
         System.out.println("enter the gender:");
         gender=sc.next();
         System.out.println("enter the age:");
         age=sc.nextInt();
         System.out.println("enter the address:");
         address=sc.next();
        }
}
class Employee extends Person
     {
      int empid;
      String company_name;
      String qualification;
      int salary;
      Employee()
        {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the empid:");
         empid=sc.nextInt();
         System.out.println("enter the company name:");
         company_name=sc.next();
         System.out.println("enter the qualification:");
         qualification=sc.next();
         System.out.println("enter the salary:");
         salary=sc.nextInt();
        }
}
class Teachers extends Employee
      { 
       int teacher_id;
       String department;
       String subject;
       Teachers()
        {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the teacher_id:");
         teacher_id=sc.nextInt();
         System.out.println("enter the department:");
         department=sc.next();
         System.out.println("enter subject taught:");
         subject=sc.next();
        }

void display()
       {
        System.out.println("name:"+super.name);
        System.out.println("gender:"+super.gender);
        System.out.println("age:"+super.age);
        System.out.println("address:"+super.address);
        System.out.println("empid:"+super.empid);
        System.out.println("company_name:"+super.company_name);
        System.out.println("qualification:"+super.qualification); 
        System.out.println("salary:"+super.salary);
        System.out.println("teacher_id:"+teacher_id);
        System.out.println("department:"+department);
        System.out.println("subject taught:"+subject);
        System.out.println();
       }
}
class MultilevelInheritence
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