import java.util.*;

public class Taxi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		sc.close();
		int taxi=0;
		Arrays.sort(a);
		int i=0;
		while(i<n)
		{
			int sum = 0;
			for(int j=i; j<n; j++)
			{
				sum = sum+a[j];
				if(sum>4)
				{
					sum = sum-a[j];
					i=j;
					break;
				}
				
				if(j==(n-1))
				{
					i=j+1;
					break;
				}
			}
			//System.out.println(i);
			taxi++;
		}
		
		System.out.println(taxi);
	}

}
