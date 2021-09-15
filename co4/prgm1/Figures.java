package Graphics;
import java.util.Scanner;
interface shape{
    void area();
}
class Rectangle implements shape{
                 public void area(){
                   int l,b;
                   float area;
                   Scanner sc=new Scanner(System.in);
                   System.out.println("enter the length and breadth of the rectangle:");
                   l=sc.nextInt();
                   b=sc.nextInt();
                   area=l*b;
                   System.out.println("the area of Rectangle is :"+area);
                  }
  }
class Triangle implements shape{
                public void area(){
                    int b,h;
                    float area;
                    Scanner sc=new Scanner(System.in);
                    System.out.println("enter the base and height of triangle:");
                    b=sc.nextInt();
                    h=sc.nextInt();
                    area=b*h/2;
                    System.out.println("the area of triangle is:"+area);
                 }
   }
class Square implements shape{
                public void area(){
                  Scanner sc=new Scanner(System.in);
                  System.out.println("enter the side of square:");
                  int a=sc.nextInt();
                  float area=a*a;
                  System.out.println("the area of square is :"+area);
                  }
 }
class Circle implements shape{
             public void area(){
                 float pi=3.14f;
                 Scanner sc=new Scanner(System.in);
                System.out.println("enter the radius of the circle:");
                int r=sc.nextInt();
                float area=pi*r*r;
                System.out.println("the area of circle is :"+area);
             }
}
class Figures{
   public static void main(String args[]){
          Rectangle r=new Rectangle();
          Triangle t=new Triangle();
          Square s=new Square();
          Circle c=new Circle();
          System.out.println();
          System.out.println("\t"+"RECTANGLE:");
          r.area();
          System.out.println();
          System.out.println("\t"+"TRIANGLE:");
          t.area();
          System.out.println();
          System.out.println("\t"+"SQUARE:");
          s.area();
          System.out.println();
          System.out.println("\t"+"CIRCLE:");
          c.area();
 }
}