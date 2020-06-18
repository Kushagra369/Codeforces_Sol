import java.util.*;

public class Drinks
{    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] ar = new double[n];
        double sum = 0;
        
        for(int i=0; i<n; i++)
        { 
            ar[i] = sc.nextDouble();
            sum = sum + ar[i]/100;
        }
        
        sum = 100*sum/n;
        
        System.out.println(sum);
    }
}