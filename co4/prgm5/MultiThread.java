import java.util.Scanner;
class Numbers{
	synchronized void mul(){
	       int num=5;
	       System.out.println("Multiplication table of 5:");		
		for(int i=1;i<=10;i++){
		num=5*i;
		System.out.println(5+"*"+i+"="+num);
		try{
		    Thread.sleep(200);
		   }catch(Exception e){
		System.out.println(e);
		}
		}
	}
	synchronized void primes(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the limit:");
		int n=sc.nextInt();
		System.out.println("The first "+n+" prime numbers are:");
		System.out.println(2);
		int num=3;
		int flag=1;
		for(int i=2;i<=n;i++)
      {
         for(int j=2;j<=Math.sqrt(num);j++)
         {
            if(num%j==0)
            {
               flag=0;
               break;
            }
         }
         if(flag!=0)
         {
            System.out.println(num);
            i++;
         }
         flag=1;
         num++;
      }         
	}

}
class Multipliplication extends Thread{
	Numbers num;
	Multipliplication(Numbers num){
		this.num=num;
	}
	public void run(){
		num.mul();
	}
}
class Prime extends Thread{
	Numbers num;
	Prime(Numbers num){
		this.num=num;
	}
	public void run(){
		
		num.primes();
	}
}
public class MultiThread{
	public static void main(String args[]){
		Numbers ob=new Numbers();
		Multipliplication  m1=new Multipliplication(ob);
		Prime p1=new Prime(ob);
		m1.start();
		p1.start();
	}
}