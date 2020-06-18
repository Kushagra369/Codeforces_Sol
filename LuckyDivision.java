import java.util.Scanner;

public class LuckyDivision
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans = "NO";
        int[] a = new int[]{4, 7, 47, 74, 77, 444, 447, 474, 477, 744, 747, 774, 777};
        
        for(int i=0; i<12; i++)
        {
            if(n%a[i]==0)
            {
                ans = "YES";
                break;
            }
        }
        System.out.print(ans);
    }
}