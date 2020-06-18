import java.util.*;

public class BeautifulYear
{
    static boolean checkdistinct(int n)
    {
        String s = Integer.toString(n);
        boolean ans = true;
        List<Character> l = new ArrayList<>();
        for(int i=0; i<s.length(); i++)
        {
            if(l.contains(s.charAt(i)))
            {
                ans = false;
                break;
            }
            else
            {
                l.add(s.charAt(i));
            }
        }
        
        return ans;
    }
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean t = false;
        
        while(t == false)
        {
            n++;
            t = checkdistinct(n);
        }
        
        System.out.println(n);
    }
}