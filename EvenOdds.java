import java.util.*;

public class Solution
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       long n = sc.nextLong();
       long k = sc.nextLong();
       long ans=0;
       if(k<=(n+1)/2)
       {
       		ans = 2*k-1;
       }
       else
       {
       		k = k - (n+1)/2;
       		ans = 2*k;
       }

       System.out.println(ans);
     }
}
