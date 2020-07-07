import java.util.*;

public class IWannaBeTheGuy 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		int p = sc.nextInt();
		for(int i=0; i<p; i++)
		{
			int x = sc.nextInt();
			arr[x-1]++;
		}
		
		int q = sc.nextInt();
		for(int i=0; i<q; i++)
		{
			int y = sc.nextInt();
			arr[y-1]++;
		}
		sc.close();
		String s = "I become the guy.";
		
		for(int i=0; i<n; i++)
		{
			if(arr[i]==0)
			{
				s = "Oh, my keyboard!";
				break;
			}
		}
		
		System.out.println(s);

	}

}
