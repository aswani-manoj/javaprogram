import java.util.Scanner;
interface Student
{
void Accademic(String name,int reg,float m1,float m2,float percentage);
}
interface Sports
{
void sports_score(String item,int rank);
} 
class Result implements Student,Sports
{
    String name;
    int reg;
    float m1;
    float m2;
    float percentage;
    String item;
    int rank;
    public void Accademic(String name,int reg,float m1,float m2,float percentage)
    {
        this.name=name;
        this.reg=reg;
        this.m1=m1;
        this.m2=m2;
        this.percentage=percentage;
    }
    public void sports_score(String item,int rank)
    {
        this.item=item;
        this.rank=rank;

    }
    void display()
    {
        System.out.println("ACADAMIC INFO");
        System.out.println("");
        System.out.println("Name : "+name);
        System.out.println("Register number : "+reg);
        System.out.println("Mark in sub 1 : "+m1);
        System.out.println("Mark in sub 2: "+m2);
        System.out.println("Percentage : "+percentage);
        System.out.println("");
        System.out.println("SPORTS INFO");
        System.out.println("");
        System.out.println("sports item: "+item);
        System.out.println("Rank : "+rank);
    }
    

}
class AccademicAndSports
{
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        Result R=new Result();
        System.out.println("Enter the name : ");
        String name=sc.next();
        System.out.println("Enter the Reg.number : ");
        int reg=sc.nextInt();
        System.out.println("Enter the mark of subject 1 : ");
        float m1=sc.nextFloat();
        System.out.println("Enter the mark of subject 2 : ");
        float m2=sc.nextInt();
        float percentage=((m1+m2)/200)*100f;
        System.out.println("Enter the  sports item : ");
        String item=sc.next();
        System.out.println("Rank obtain in the item : ");
        int rank=sc.nextInt();
        R.Accademic(name,reg,m1,m2,percentage);
        R.sports_score(item,rank);
        R.display();
        
    }
}