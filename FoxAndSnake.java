import java.util.*;

public class FoxAndSnake
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int flag=0;
        
        char[][] a = new char[n][m];
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                if(i%2==0)
                {
                    a[i][j] = '#';
                }
                else 
                {
                    a[i][j] = '.'; 
                }
            }
        }
        
        
        for(int i=1; i<n; i=i+2)
        {
            if(((i-1)/2)%2==0)
            {
                a[i][m-1] = '#';
            }
            else if (((i-1)/2)%2==1)
            {
                a[i][0] = '#';
            }
        }
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<m; j++)
            {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}