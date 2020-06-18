import java.util.*;

public class StonesOnTheTable
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        char[] a = s.toCharArray();
        int count = 0; 
        for(int i=0; i<n-1; i++)
        {
            if(a[i]==a[i+1])
            {
                count++;
            }
        }
        
        System.out.println(count);
    }
    
}
