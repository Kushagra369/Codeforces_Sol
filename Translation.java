import java.util.*;

public class Translation 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int n = s.length();
        int m = t.length();
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        
        if(m!=n)
        {
            s = "NO";
        }
        else
        {
            for (int i=0; i<n; i++)
            {
                if(ss[i]!=tt[n-i-1])
                {
                    s = "NO";
                    break;
                }
                s = "YES";
            }
        }
        
        System.out.println(s);

    }
    
}
