import java.util.*;

public class BoyorGirl 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count=0;
        List<Character> a = new ArrayList<>();
        
        for(int i=0; i<s.length(); i++)
        {
            if(a.contains(s.charAt(i))==false)
            {
                a.add(s.charAt(i));
                count++;
            }
        }
        
        if(count%2==0)
        {
            System.out.println("CHAT WITH HER!");
        }
        else
        {
            System.out.println("IGNORE HIM!");
        }

    }
    
}
