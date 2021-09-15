import java.util.Scanner;
class FibonacciEven{
   int count=0;
   synchronized void fibonacci(){
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the limit for fibonnacci series:");
     int n=sc.nextInt();
     System.out.println("the first "+n+"terms of the fibonacci sequence is:");
     System.out.println(0);
     System.out.println(1);
     int a=0;
     int b=1;
     int c;
     while(count<(n-2)){
        c=a+b;
        System.out.println(c);
        count=count+1;
        a=b;
        b=c;
        try{
           Thread.sleep(200);     
        }catch(Exception e)
          {
          System.out.println(e);
          }
    }
   } 
   synchronized void even(){
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the limit for even numbers:");
       int n=sc.nextInt();
       int count=0;
       System.out.println("the first "+n+" even numbers are:");
         for(int i=1;count<n;i++){
           if(i%2==0){
             count++;
             System.out.println(i);
           }
      }
    }
 }
class FibonacciNum implements Runnable{
    FibonacciEven f;
     FibonacciNum(FibonacciEven f){
         this.f=f;
    }
    public void run(){
        f.fibonacci();
     }
}
class EvenNum implements Runnable{
     FibonacciEven f;
      EvenNum(FibonacciEven f){
          this.f=f;
       }
       public void run(){
           f.even();
      }
}
public class ThreadRunnable{
     public static void main(String args[]){
          FibonacciEven o=new FibonacciEven();
          FibonacciNum f=new FibonacciNum(o);
          EvenNum e=new EvenNum(o);
          Thread t1=new Thread(f);
          Thread t2=new Thread(e);
           t1.start();
           t2.start();
  }

}