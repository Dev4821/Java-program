import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        String s=new String();
        int f=0;
        int c1=0;
        int c2=0;
        if(a.length()!=b.length())
        {
            f=1;
        }
        else
        {
        for(int i=0;i<a.length();i++)
        {
            c1=0;
            c2=0;
            if(s.indexOf(a.charAt(i))<0)
            {
                s=s+a.charAt(i);
            for(int j=0;j<a.length();j++)
            {
               if(Character.toLowerCase(a.charAt(i))==Character.toLowerCase(a.charAt(j)))
               {
                   c1++;
               } 
              if(Character.toLowerCase(a.charAt(i))==Character.toLowerCase(b.charAt(j)))
               {
                   c2++;
               }
            }
            if(c1!=c2)
            {
                f=1;
                break;
            }
            }
        }
        }
        if(f==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
