import java.util.*;

public class CollectingCoins {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			long a = sc.nextLong();
			long b = sc.nextLong();
			long c = sc.nextLong();
			long n = sc.nextLong();
			double x = (a+b+c+n)/3.0;
			if(x>(int)x)
			{
				System.out.println("NO");
			}
			else
			{
				if(x>=Math.max(a, Math.max(b, c)))
				{
					System.out.println("YES");
				}
				else
				{
					System.out.println("NO");
				}
			}
		}
		sc.close();
	}

}
