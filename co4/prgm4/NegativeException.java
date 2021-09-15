import java.util.Scanner;
class Myexception extends Exception{
      Myexception(){
             super();
      }
       Myexception(String s){
             super(s);
 }
}
class NegativeException{
    public static void main(String args[]){
         try{
            float sum=0,num=0;
            float avg;
            int i=1;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the no of numbers:");
            int n=sc.nextInt();
            System.out.println("enter the numbers:");
            while(i<=n)
            {
            num=sc.nextInt();
            if(num<0)
                 throw new  Myexception("Negative Number");
             else
                 sum=sum+num;
                 i=i+1;
                 
             }
                 avg=sum/n;
                 System.out.println("the average of numbers is:"+avg);
             }
             catch( Myexception e){
                 System.out.println(e);
             }
             finally{
                  System.out.println("program ends....");
             }
}
}