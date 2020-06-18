import java.util.*;

public class CandiesAndTwoSisters
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        for (int i=0; i<t; i++)
        {
            int n = sc.nextInt();
            int count = 0;
            if(n>2)
            {
                if(n%2==0)
                {
                    count = n/2 -1;
                }
                else
                {
                    count = n/2;
                }
            }
            
            System.out.println(count);
        }
    }
}