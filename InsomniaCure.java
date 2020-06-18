import java.util.*;

public class InsomniaCure
{    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int l = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();
        int d = sc.nextInt();
        int count=0;
        
       int[] ar = new int[d];
       
       for(int i=k-1; i<d; i=i+k)
       {
           if(ar[i]==0)
           {
               ar[i]=1;
               count++;
           }
       }
       
       for(int i=l-1; i<d; i=i+l)
       {
           if(ar[i]==0)
           {
               ar[i]=1;
               count++;
           }
       }
       
       for(int i=m-1; i<d; i=i+m)
       {
           if(ar[i]==0)
           {
               ar[i]=1;
               count++;
           }
       }
       
       for(int i=n-1; i<d; i=i+n)
       {
           if(ar[i]==0)
           {
               ar[i]=1;
               count++;
           }
       }
        
        System.out.println(count);
    }
}