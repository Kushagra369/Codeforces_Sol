import java.io.*; 
import java.util.*; 
   
public class Godsend 
{       
    static boolean containsodd(int[] arr, int n)
    {
        boolean t = false;
        
        for(int i=0; i<n; i++)
        {
            if(arr[i]%2!=0)
            {
                t = true;
                break;
            }
        }
        
        return t;
        
    }
    
    public static void main(String[] args) 
    { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = " ";
        int sum=0;
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];          
        }
        
        if(sum%2!=0)
        {
            ans = "First";
        }
        else
        {
            boolean t = containsodd(arr, n);
            if(t==true)
            {
                ans = "First";
            }
            else
            {
                ans = "Second";
            }
        }
        
        System.out.println(ans); 
    } 
} 