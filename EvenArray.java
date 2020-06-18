import java.util.*;

public class EvenArray
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       for(int i=0; i<t; i++)
       {
           int n = sc.nextInt();
           int[] arr = new int[n];
           int count1=0;
           int count2=0;
           for(int j=0; j<n; j++)
           {
               arr[j] = sc.nextInt();
               if(j%2==1 && arr[j]%2==0)
               {
                   count1++;
               }
               else if(j%2==0 && arr[j]%2==1)
               {
                   count2++;
               }
           }
           int ans = -1;
           
           if(count1==count2)
           {
               ans = count1;
           }
           
           System.out.println(ans);
           
       }
       
        
    }
}