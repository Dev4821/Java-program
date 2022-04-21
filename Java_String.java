import java.io.*;
import java.util.*;
import java.lang.*;

public class Java_String {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int l=A.length()+B.length();
     System.out.println(l);
     String firstLetter =A.substring(0, 1);
    String remainingLetters = A.substring(1, A.length());
     firstLetter = firstLetter.toUpperCase();
     A=firstLetter+remainingLetters;
     
     String firstLetter1 =B.substring(0, 1);
    String remainingLetters1 = B.substring(1, B.length());
     firstLetter1 = firstLetter1.toUpperCase();
     B=firstLetter1+remainingLetters1;
     
     if(B.compareTo(A)>=0)
     {
         System.out.println("No");
         System.out.println(A+" "+B);
     }
     else
     {
         System.out.println("Yes");
         System.out.println(A+" "+B);
     }
     
     
    }
}

