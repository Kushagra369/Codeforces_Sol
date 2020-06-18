import java.util.*;

public class MaximumSumofDigits
{    
    static long maxdidigitsum(long a)
    {
        long s=0;
        while(a!=0)
        {
            s = s + a%10;
            a = a/10;
        }
        
        return s;
    }
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans=0;
        
        if(n<10)
        {
            System.out.println(n);
        }
        else
        {
            while((ans*10)+9<=n)
            {
                ans = ans*10+9;
            }
            
            ans = maxdidigitsum(ans)+maxdidigitsum(n-ans);
            System.out.println(ans);
        }
        
    }
}