import java.util.*;

public class ArrivalOfTheGeneral
{    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int max = 0;
        int mini = 0;
        int maxi = 0;
        int ans=0;
        int[] ar = new int[n];
       
       for(int i=0; i<n; i++)
       {
           ar[i] = sc.nextInt();
           
           if(ar[i]>max)
           {
               max = ar[i];
               maxi = i;
           }
           
           if(ar[i]<=min)
           {
               min = ar[i];
               mini = i;
           }
       }
       
       if(mini>maxi)
       {
           ans = (n-1-mini)+(maxi);
       }
       else if(mini<maxi)
       {
           ans = (n-1-mini)+(maxi)-1;
       }
        
        System.out.println(ans);
    }
}