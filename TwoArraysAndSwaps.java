import java.util.*;

public class TwoArraysAndSwaps {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int n = sc.nextInt();
			int k = sc.nextInt();
			int a[] = new int[n];
			int b[] = new int[n];
			int count = 0;
			
			for(int i=0; i<n; i++)
			{
				a[i] = sc.nextInt();
			}
			
			for(int i=0; i<n; i++)
			{
				b[i] = sc.nextInt();
			}
			Arrays.sort(a);
			Arrays.sort(b);
			int x = n-1;
			int temp = 0;
			
			for(int i=0; i<n; i++)
			{
				if(count == k)
				{
					break;
				}
				
				if(a[i]<b[x])
				{
					temp = a[i];
					a[i] = b[x];
					b[x] = temp;
					count++;
					x--;
				}
			}
			
			int sum = 0;
			for(int i: a)
			{
				sum += i;
			}
			
			System.out.println(sum);
			
		}
		sc.close();
	}

}
