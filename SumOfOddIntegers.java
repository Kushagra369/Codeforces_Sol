import java.util.*;

public class SumOfOddIntegers
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for (int i=0; i<t; i++)
        {
            long n = sc.nextLong();
            long k = sc.nextLong();
            String ans = " ";
            
            if((k*k)>n)
            {
                ans = "NO";
            }
            else if(n%2==1 && k%2==0)
            {
                ans = "NO";
            }
            else if(n%2==0 && k%2==1)
            {
                ans = "NO";
            }
            else
            {
                ans ="YES";
            }
            
            System.out.println(ans);
        }
    }
}