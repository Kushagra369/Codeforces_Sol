import java.util.*;

public class IsYourHorseshoeOnTheOtherHoof
{    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        List<Integer> a = new ArrayList<>();
        
        for(int i=0; i<4; i++)
        {
            int n = sc.nextInt();
            
            if(a.contains(n)==false)
            {
                a.add(n);
                ans++;
            }
        }
        
        ans = 4 - ans;
        
        System.out.println(ans);
    }
}