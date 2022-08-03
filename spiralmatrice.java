import java.util.*;
 
public class Main{
   public static void main(String args[])
   {
     Scanner sc= new Scanner(System.in);
     int row=sc.nextInt();
     int col=sc.nextInt();
     int arr[][]=new int[row][col];
     for(int i=0;i<row;i++)
     {
         for(int j=0;j<col;j++)
         {
             arr[i][j]=sc.nextInt();
         }
     }
      for(int i=0;i<row;i++)
     {
         for(int j=0;j<col;j++)
         {
             System.out.printf(arr[i][j]+" ");
         }
         System.out.println();
     }
     System.out.print("the spiral representation:");
    int row_start=0;
    int row_end=row-1;
    int column_start=0;
    int column_end=col-1;
     while(row_start <= row_end && column_start <= column_end)
    {
        for(int j=column_start;j<=column_end;j++)
        {
            System.out.printf(arr[row_start][j]+" ");
        }
        row_start++;
         for(int i=row_start;i<=row_end;i++)
        {
            System.out.printf(arr[i][column_end]+" ");
        }
        column_end--;
         for(int j=column_end;j>=column_start;j--)
        {
            System.out.printf(arr[row_end][j]+" ");
        }
        row_end--;
        for(int i=row_end;i>=row_start;i--)
        {
            System.out.printf(arr[i][column_start]+" ");
        }
        column_start++;
        
    }

   }
}
