import java.util.Scanner;

public class Football
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int count = 0;
        String ans = "NO";
        
        for(int i=0; i<n-1; i++)
        {
            if(s.charAt(i)!=s.charAt(i+1))
            {
                count = 0;
            }
            else
            {
                count++;
            }
            
            if (count==6)
            {
                ans = "YES";
                break;
            }
        }
        
        System.out.print(ans);
    }
}