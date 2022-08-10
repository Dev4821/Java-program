class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
             Collections.sort(a);
        int i=0,j=m-1,res=Integer.MAX_VALUE;
        while(j<n)
        {
            if((a.get(j)-a.get(i))<res)
            {
                res=a.get(j)-a.get(i);
            }
            i++;
            j++;
        }
        
        return res;
    }
}
