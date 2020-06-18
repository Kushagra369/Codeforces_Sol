import java.util.*;
import java.lang.*;

public class FriendsMeeting
{    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ans = 0;
        int c = Math.abs(a-b);
        int n = c/2;
        
        if(c%2==0)
        {
            ans = (n*(n+1));
        }
        else 
        {
            ans = (n*(n+1)) + (n+1);
        }
       
        System.out.println(ans);
    }
}