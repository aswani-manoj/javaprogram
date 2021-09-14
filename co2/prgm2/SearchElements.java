import java.util.Scanner;
class SearchElements
  {
   public static void main(String args[])
    {
     int flag=0,i;
     Scanner sc=new Scanner(System.in);
     System.out.println("enter the number of elements:");
     int n=sc.nextInt();
     int[] a=new int[n];
     System.out.println("enter the array elemnets:");
      for(i=0;i<n;i++)
       {
        a[i]=sc.nextInt();
       }
      System.out.println("the array lements are:");
       for(i=0;i<n;i++)
        {
         System.out.println(a[i]);
        }
        System.out.println("enter the element to be searched:");
        int x=sc.nextInt();
        for(i=0;i<n;i++)
         {
        if(a[i]==x)
         {
        flag=1;
        break;
         }
         else
         {
          flag=0;
         }
         }
        if(flag==1)
           {
           System.out.println("the element present at the postion "+(i+1));
           }
        else
           {
           System.out.println("the element not found");
           }
}   
}
