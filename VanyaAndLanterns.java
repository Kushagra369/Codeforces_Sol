import java.util.*;

public class VanyaAndLanterns {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int d = sc.nextInt();
		int[] a = new int[n+1];
		
		for(int i=0; i<=n; i++)
		{
			if(i==n)
			{
				a[i] = d;
			}
			else
			{
				a[i] = sc.nextInt();
			}
		}
		Arrays.sort(a);
		double diff = 0;
		double max = Math.max(a[0], a[n]-a[n-1]);
		for(int i=1; i<=n; i++)
		{
			diff = (a[i] - a[i-1])/2.00;
			
			if(diff>max)
			{
				max = diff;
			}
		}
		sc.close();
		System.out.println(max);
	}

}
