import java.util.*;

public class WordCapitalization 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        int i = (int)s.charAt(0);
        if(i>96 && i<123)
        {
            sb.append((char)(i-32));
        }
        else
        {
            sb.append(s.charAt(0));
        }
        
        for(int j=1; j<n; j++)
        {
            sb.append(s.charAt(j));
        }
        
        s = sb.toString();
        
        System.out.println(s);
    }
    
}
