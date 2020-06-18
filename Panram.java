import java.util.*;

public class Pangram
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        String s = sc.next();      
        s = s.toLowerCase();
        int count = 0;
        String ans = "YES";
        List<Character> l = new ArrayList<>();
        
        for(int i=0; i<n; i++)
        {
            if(l.contains(s.charAt(i))==false)
            {
                count++;
                l.add(s.charAt(i));
            }
        }
        if (count!=26)
        {
            ans = "NO";
        }
        System.out.println(ans);
    }
}