import java.util.*;

public class VanyaandFences
{    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = n;
        int h = sc.nextInt();
        int[] a = new int[n];
        
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
            if(a[i]>h)
            {
                count++;
            }
        }
        
        System.out.print(count);
       
    }
}