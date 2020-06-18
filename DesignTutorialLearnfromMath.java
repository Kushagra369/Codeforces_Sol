import java.util.*;

public class DesignTutorialLearnfromMath
{    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 0;
               
        if(n%2==0)
        {
            a = 4;
            b = n - 4;
        }
        else
        {
            a = 9;
            b = n - 9;
        }
            
        System.out.println(a+" "+b);
        
    }
}