import java.util.Scanner;

public class SubstringCompare {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        int n=s.length()-(k-1);
        String arr[]=new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.substring(i,i+k);
           
            if(i==0)
            {
                smallest=arr[i];
            }
            if(smallest.compareTo(arr[i])>=0)
            {
                smallest=arr[i];
            }
            if(arr[i].compareTo(largest)>0)
            {
                largest=arr[i];
            }
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
