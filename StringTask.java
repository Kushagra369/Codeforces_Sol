import java.util.Scanner;

public class StringTask
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = s.toLowerCase();
        int n = s.length();
        
        for(int i=0; i<n; i++)
        {
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='y' || s.charAt(i)=='u')
            {
                
            }
            else
            {
                System.out.print("."+s.charAt(i));
            }
        }
    }
}