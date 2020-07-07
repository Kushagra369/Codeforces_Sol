import java.util.*;

public class Twins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double sum = 0;
		int[] a = new int[n];
		
		for(int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
			sum = sum + a[i];
		}
		sc.close();
		
		sum = sum/2;
		//System.out.println(sum);
		
		Arrays.sort(a);
		double tempsum = 0;
		int ans = 0;
		
		for(int i=n-1; i>=0; i--)
		{
			if(tempsum>sum)
			{
				break;
			}
			tempsum = tempsum + a[i];
			ans++;
		}
		
		System.out.println(ans);
	}

}
