import java.util.Scanner;
class SymmetricMatrix
     {
      public static void main(String args[])
      {
       int m,n;
       int flag=0;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the number of rows:");
       m=sc.nextInt();
       System.out.println("enter the number of columns:");
       n=sc.nextInt();
       int[][] a=new int[m][n];
       System.out.println("enter the elements:");
       for(int i=0;i<m;i++)
         {
          for(int j=0;j<n;j++)
           {
            a[i][j]=sc.nextInt();
           }
         }
        System.out.println("the matrix is:");
        for(int i=0;i<m;i++)
         {
          for(int j=0;j<n;j++)
           {
            System.out.print(a[i][j]+" ");
             if(a[i][j] != a[j][i])
             flag =1;
            }
            System.out.println();
           }
        if(flag==0)
            System.out.println("The matrix is symmetric.");
        else
            System.out.println("The matrix is not symmetric.");
     }
  
}