import java.util.*;
import java.lang.*;

public class LittleCLoves3I
{    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a, b, c;
        
        if(n%3==0 || n%3==1)
        {
            a = 1;
            b = 1;
            c = n-2;
        }
        else 
        {
            a = 1;
            b = 2;
            c = n-3;
        }
                
        System.out.println(a+" "+b+" "+c);
    }
}