
import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
  
        
        int t = Integer.parseInt(br.readLine()); 

        while(t > 0){
  
            String x = br.readLine(); 
            
            Solution ob = new Solution();
		
            System.out.println(ob.xmod11(x)); 

            t--;
        }
    } 
} 


// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    static int xmod11(String x)
	{    
	    
        int len = x.length(); 
  
        int num, rem = 0; 
     
        for (int i = 0; i < len; i++) { 
            num = rem * 10 + (x.charAt(i) ); 
            rem = num % 11; 
        } 
      
        return rem; 
        
	}
} 

