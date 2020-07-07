import java.util.*;
public class KefaAndFirstSteps {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		sc.close();
		int count = 0;
		int max = 0;
		
		for(int i=0; i<n-1; i++)
		{
			if(a[i]<=a[i+1])
			{
				count++;
			}
			else
			{
				count = 0;
			}
			
			if(count>max)
			{
				max = count;
			}
		}
		
		System.out.println(max+1);
	}

}
