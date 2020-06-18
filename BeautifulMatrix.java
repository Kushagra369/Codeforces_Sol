import java.util.*;

public class BeautifulMatrix 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[5][5]; 
        int ans = 0;
        
        for(int i=0; i<5; i++)
        {
            for(int j=0; j<5; j++)
            {
                a[i][j] = sc.nextInt();
                if(a[i][j]==1)
                {
                    ans = Math.abs(3-(i+1)) + Math.abs(3-(j+1));
                }
            }
        }
        
        System.out.println(ans);
    }
    
}
