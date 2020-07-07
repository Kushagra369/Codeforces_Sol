import java.util.*;

public class HonestCoach {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i=0; i<n; i++)
			{
				a[i] = sc.nextInt();
			}
			
			Arrays.sort(a);
			int diff;
			int min = Integer.MAX_VALUE;
			for(int i=0; i<n-1; i++)
			{
				diff = a[i+1] - a[i];
				
				if(diff<min)
				{
					min = diff;
				}
			}
			
			System.out.println(min);
		}
		sc.close();
	}

}
