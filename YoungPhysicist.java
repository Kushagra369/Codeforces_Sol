import java.util.Scanner;

public class YoungPhysicist
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 0;
        int y = 0;
        int z = 0;
        
        int[][] arr = new int[n][3];
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<3; j++)
            {
                arr[i][j] = sc.nextInt();
                
                if(j==0)
                {
                    x = x + arr[i][j];
                }
                else if(j==1)
                {
                    y = y + arr[i][j];
                }
                else
                {
                    z = z + arr[i][j];
                }
            }
        }
        String ans = "NO";
        
        if(x==0 && y==0 && z==0)
        {
            ans = "YES";
        }
        
        System.out.print(ans);
    }
}