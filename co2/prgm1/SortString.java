import java.util.*;
class SortString{
      String str;
      void get_string()
        { 
          Scanner sc=new Scanner(System.in);
          System.out.println("enter the String:");
          str=sc.nextLine();
        }
      void sort()
         {
          char CharArray[]=str.toCharArray();
          Arrays.sort(CharArray);
          System.out.println("sorted string is:"+new String(CharArray));
          }
public static void main(String args[]){
SortString s=new SortString();
s.get_string();
s.sort();
}
}