import java.util.*;

public class ShortSubstrings
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       for(int i=0; i<t; i++)
       {
           String b = sc.next();
           String a = " ";
           StringBuilder sb = new StringBuilder();
           int n = b.length();
           if(n>2)
           {
                sb.append(b.charAt(0));
                
                for(int j=1; j<n; j+=2)
                {
                    sb.append(b.charAt(j));
                }
                a = sb.toString();
           }
           else
           {
               a = b;
           }
           System.out.println(a);
           
       }
       
        
    }
}