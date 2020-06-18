import java.util.Scanner;

public class HQ9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        String ans = "NO";
        
        for(int i=0; i<n; i++)
        {
            if(s.charAt(i)=='H' || s.charAt(i)=='Q' || s.charAt(i)=='9')
            {
                ans = "YES";
                break;
            }
        }
        System.out.print(ans);
    }
}