import java.util.*;

public class MostUnstableArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			long n = sc.nextLong();
			long m  = sc.nextLong();
			long ans = 0;
			if(n==1)
			{
				ans = 0;
			}
			else if(n==2)
			{
				ans = m;
			}
			else
			{
				ans = 2*m;
			}
			
			System.out.println(ans);
		}
		sc.close();
	}

}
