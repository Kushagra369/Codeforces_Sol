import java.util.*;

public class UltraFastMathematician
{    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int n = a.length();
        int[] ar = new int[n];
        
        for(int i=0; i<n; i++)
        {
            if(a.charAt(i)!=b.charAt(i))
            {
                ar[i] = 1;
            }
            else
            {
                ar[i] = 0;
            }
        }
        
        for(int i=0; i<n; i++)
        {
            System.out.print(ar[i]);
        }
    }
}