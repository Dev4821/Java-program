import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String rev = new String();
        for(int  i=A.length()-1;i>=0;i--)
        {
            rev =rev+A.charAt(i);
        }
        if(rev.compareTo(A)==0)
        {
            System.out.print("Yes");
        }
        else 
        {
            System.out.print("No");
        }
    }
}