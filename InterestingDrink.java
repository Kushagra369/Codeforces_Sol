import java.util.*;

public class InterestingDrink {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		int q = sc.nextInt();
		Arrays.sort(a);
		for(int i=0; i<q; i++)
		{
			int x = sc.nextInt();
			int count = 0;
			for(int j=0; j<n; j++)
			{
				if(x>=a[j])
				{
					count++;
				}
				else
				{
					break;
				}
			}
			
			System.out.println(count);
		}
		sc.close();
	}

}
