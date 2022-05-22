import java.util.*;
class Barabara{
     public static int myMethod(String I,String P)
    {
        int edits=0;
        int i=0;
        int j=0;
        int l1=I.length();
        int l2=P.length();
        while(j<l2)
        {
            if(i>=l1)
            {
                edits++;
                j++;

            }
           else if (I.charAt(i)!=P.charAt(j))
            {
                j++;
                edits++;
                if(j>=l2)
                {
                    return -1;
                }
            }
            else
            {
                i++;
                j++;
            }

        }
        return edits;

    }
    public static void main(String args[])
    {
      Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
      
        while(n>0){
           String I=sc.next();
           String P=sc.next(); 
           int s=myMethod(I,P);
           if(s==-1)
           {
               System.out.println("IMPOSSIBLE");
           }
           else{
               System.out.println(s);
           }
         n--;
        }

        sc.close();
    }
}
