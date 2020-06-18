import java.util.*;

public class NearlyLuckyNumber 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int count=0;
        
        for(int i=0; i<n; i++)
        {
            if(s.charAt(i)=='4' || s.charAt(i)=='7')
            {
                count++;
            }
        }
        
        String c = Integer.toString(count);
        String ans = "YES";
        n = c.length();
        
        for(int i=0; i<n; i++)
        {
            if(c.charAt(i)!='4' && c.charAt(i)!='7')
            {
                ans = "NO";
                break;
            }
        }

        System.out.println(ans);

    }
    
}
