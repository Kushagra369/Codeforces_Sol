import java.util.*;

public class Word 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int cl = 0;
        int cu = 0;
        
        for(int i=0; i<n; i++)
        {
            if((int)s.charAt(i)>64 && (int)s.charAt(i)<91)
            {
                cu++;
            }
            else if((int)s.charAt(i)>96 && (int)s.charAt(i)<123)
            {
                cl++;
            }
        }
        
        if(cl>=cu)
        {
            s = s.toLowerCase();
        }
        else
        {
            s = s.toUpperCase();
        }
        
        System.out.println(s);

    }
    
}
