import java.util.*;

public class NewYearAndCurling
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        
        double [] xcord = new double[n];
        for(int  i=0; i<n; i++)
        {
            xcord[i] = sc.nextDouble();
        }
        
        double [] ycord = new double[n];
        ycord[0] = r;
        
        double a=0;
        double b=0;
        double c=0;
        double x=0;
        
        for(int i = 1; i<n; i++)
        {
            ycord[i] = r*1.0;
            
            for(int j=0; j<i; j++)
            {
                if(xcord[i]!=xcord[j])
                {
                    a = (r+r)*(r+r);
                    b = (xcord[j]-xcord[i])*(xcord[j]-xcord[i]);

                    c = a - b;
                    x = Math.sqrt(c)*(1.0)+ycord[j];
                    ycord[i] = Math.max(ycord[i],x);
                }
                else
                {
                    ycord[i] = Math.max(ycord[i], r+r+ycord[j]);
                }
            }
        }
        
        for(int i=0; i<n; i++)
        {
            System.out.print(ycord[i]+" ");
        }
        
    }
}