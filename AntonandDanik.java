import java.util.*;

public class AntonandDanik
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int a = 0;
        int d = 0;
        
        for(int i=0; i<n; i++)
        {
           if(s.charAt(i)=='A')
           {
               a++;
           }
           else if(s.charAt(i)=='D')
           {
               d++;
           }
        }
        
        if(a>d)
        {
            s = "Anton";
        }
        else if(d>a)
        {
            s = "Danik";
        }
        else
        {
            s = "Friendship";
        }
        
        System.out.println(s);
    }
}