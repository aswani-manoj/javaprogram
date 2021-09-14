import java.util.Scanner;
class Employee{
   int eNo;
   String eName;
   int eSalary;
   void GetData()
         {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the employee id:");
       eNo=Integer.parseInt(sc.nextLine());
       System.out.println("enter the employee name:");
       eName=sc.nextLine();
       System.out.println("enter the employee salary:");
       eSalary=Integer.parseInt(sc.nextLine());
}
    void PutData()
        {
       System.out.println("\n\t"+eNo+"\t"+eName+"\t"+eSalary);
        }
public static void main(String args[])
      {
      int no;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number of employee:");
      int n=sc.nextInt();
      Employee[] emp=new Employee[n];
      for(int i=0;i<n;i++)
      emp[i]=new Employee();
      for(int i=0;i<n;i++)
      {
        System.out.println("enter the details of"+(i+1)+"Employee:");
        emp[i].GetData();
       }
       System.out.println("the employee datils are:");
       for(int i=0;i<n;i++)
       emp[i].PutData();
       System.out.println("enter the employee_no to search:");
       no=sc.nextInt();
       for(int i=0;i<emp.length;i++)
          {
      
           if(emp[i].eNo==no)
            {
             emp[i].PutData();
            }
       }
   }

}