import java.util.Scanner;
class MatrixAddition{
public static void main(String args[]){
int m,n,x,y;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of rows and colums of first matrix:");
m=sc.nextInt();
n=sc.nextInt();
System.out.println("enter the number of rows and colums of second matrix:");
x=sc.nextInt();
y=sc.nextInt();
if(m==x&&n==y)
{
int[][] a=new int[m][n];
int[][] b=new int[x][y];
int[][] c=new int[x][y];
System.out.println("enter the first matrix element:");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
a[i][j]=sc.nextInt();
}
}
System.out.println("enter the second matrix elements:");
for(int i=0;i<x;i++)
{
for(int j=0;j<y;j++)
{
b[i][j]=sc.nextInt();
}
}
System.out.println("the first matrix is:");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
System.out.print(a[i][j]+" ");
System.out.print(" ");
}
System.out.println(" ");
}
System.out.println("the second matrix is:");
for(int i=0;i<x;i++)
{
for(int j=0;j<y;j++)
{
System.out.print(b[i][j]+" ");
System.out.print(" ");
}
System.out.println(" ");
}
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
c[i][j]=a[i][j]+b[i][j];
}
}
System.out.println("matrix after addition is:");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
System.out.print(c[i][j]+" ");
System.out.print(" ");
}
System.out.println(" ");
}
}
else
{
System.out.println("matrix addition is not possible");
}
}
}