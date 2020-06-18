import java.util.*;

public class InSearchofanEasyProblem

{    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        String an = "EASY";
        
        for(int i=0; i<n; i++)
        {
            ar[i] = sc.nextInt();
            if(ar[i]==1)
            {
                an = "HARD";
            }
        }
        System.out.println(an);
       
    }
}