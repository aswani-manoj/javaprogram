import java.util.Scanner;
class Usernameexcption extends Exception{
       Usernameexcption(String s){
                      super(s);


      }
}
class Passwordexception extends Exception{
      Passwordexception(String s){
                     super(s);
       }
}
class Authentication{
       public static void main(String args[]){
           String username,password;
           try{
                Scanner sc=new Scanner(System.in);
                System.out.println("enter the username:");
                username=sc.nextLine();
                System.out.println("enter the password:");
                password=sc.nextLine();
                int length=username.length();
                if(length<8)
                    throw new Usernameexcption("must contain 8 characters");
                else if(!password.equals("abc@123"))               
                     throw new  Passwordexception("incorrect password");
                else
                     System.out.println("login successfull");
                }
                 catch(Usernameexcption e){
                        System.out.println(e);
                  }
                  catch( Passwordexception e){
                         System.out.println(e);
                  }
                 finally{
                       System.out.println("program ends....");
}
}
}