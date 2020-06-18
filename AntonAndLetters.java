import java.util.*;

public class AntonAndLetters
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        int n = s.length();
        int count = 0;
        List<Character> l = new ArrayList<>();
        
        for(int i=1; i<n; i=i+3)
        {
            char a = s.charAt(i);
            
            if((int)a>96 && (int)a<123 && l.contains(a)==false)
            {
                count++;
                l.add(a);
            }
        }
        
        System.out.println(count);
    }
}