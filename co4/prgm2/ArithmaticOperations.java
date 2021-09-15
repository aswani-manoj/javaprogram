package Arithematic;
import java.util.Scanner;
interface arithmatic_operation{
    void addition();
    void substraction();
    void multiplication();
    void division();
  }
class operations implements arithmatic_operation{
    public void addition(){
        int a,b,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers:");
        a=sc.nextInt();
        b=sc.nextInt();
        sum=a+b;
        System.out.println("the sum of two numbers is "+sum);
      }
public void substraction(){
        int a,b,sub;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers:");
        a=sc.nextInt();
        b=sc.nextInt();
        sub=a-b;
        System.out.println("the difference of two numbers is "+sub);
      }
public void multiplication(){
        int a,b,mul;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers:");
        a=sc.nextInt();
        b=sc.nextInt();
        mul=a*b;
        System.out.println("the multiplication of two numbers is "+mul);
      }
public void division(){
        int a,b,div;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers:");
        a=sc.nextInt();
        b=sc.nextInt();
        div=a/b;
        System.out.println("the division of two numbers is: "+div);
      }
}
class ArithmaticOperations{
   public static void main(String args[]){
          operations o=new operations();
          System.out.println("\t"+"ADDITION");
          o.addition();
          System.out.println("\t"+"SUBSTRACTION");
          o.substraction();
          System.out.println("\t"+"MULTIPLICATION");
          o.multiplication();
          System.out.println("\t"+"DIVISION");
          o.division();
}
}