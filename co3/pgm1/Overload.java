class Shapes
    {
     float pi=3.14f;
     int length,breadth,radius;
     void area(int radius)
       {
         System.out.println("Area of circle is:"+(pi*radius*radius));
       }
     void area(int length,int breadth)
       {
         System.out.println("Area of rectangle is:"+(length*breadth));
       }
   }
class Overload
    {
      public static void main(String args[])
       {
        Shapes s=new Shapes();
        s.area(3);
        s.area(3,6);
        }
     }