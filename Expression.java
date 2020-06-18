import java.util.*;

public class Expression
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ans;
        int max = 0;

        ans = (a+b)*c;
        if(ans > max)
        {
            max = ans;
        }
        ans = a+b*c;
        if(ans > max)
        {
            max = ans;
        }
        ans = a*b+c;
        if(ans > max)
        {
            max = ans;
        }
        ans = a*(b+c);
        if(ans > max)
        {
            max = ans;
        }
        ans = a+b+c;
        if(ans > max)
        {
            max = ans;
        }
        ans = a*b*c;
        if(ans > max)
        {
            max = ans;
        }
        
        System.out.println(max);
        
    }
}