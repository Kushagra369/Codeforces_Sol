import java.util.*;

public class Presents
{    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] p = new int[n];
        
        for(int i=0; i<n; i++)
        {
            a[i] = sc.nextInt();
            p[a[i]-1] = i+1;
        }
        
        for(int i=0; i<n; i++)
        {
            System.out.print(p[i]+" ");
        }
    }
}