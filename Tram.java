import java.util.*;

public class Tram 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ar = 0;
        int max=0;
        
        for(int i=0; i<n; i++)
        {
            ar = ar - sc.nextInt();
            ar = ar + sc.nextInt();
            
            if(ar>=max)
            {
                max=ar;
            }
        }
        
        System.out.println(max);

    }
    
}
