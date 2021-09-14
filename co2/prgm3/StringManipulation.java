import java.util.*;
class StringManipulation{
        void Manipulations(){
        Scanner sc=new Scanner(System.in);
        System.out.println( "enter the string:");
        String str=sc.nextLine();
        System.out.println( "String Length is : " + str.length());
        System.out.println("String concatination : " +str.concat("concated"));
        System.out.println("Index of character 's': " + str.indexOf('s'));
        System.out.println("Character at position 5: " + str.charAt(5));
        System.out.println("Compare To 'text': " + str.compareTo("text"));
        System.out.println("EndsWith character 'r': " + str.endsWith("r"));
        System.out.println("Replace 'text' with 'words': " + str.replace("text", "words"));
        System.out.println("Convert to LowerCase: " + str.toLowerCase());
        System.out.println("Convert to UpperCase: " + str.toUpperCase());
    }
public static void main(String args[]){
StringManipulation s=new StringManipulation();
s.Manipulations();
}
}