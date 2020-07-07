import java.util.*;
public class Dragons 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] a = new int[n][2];
		for(int i=0; i<n; i++)
		{
			a[i][0] = sc.nextInt();
			a[i][1] = sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(a, new Comparator<int[]>(){
			public int compare(int[] x1, int[] x2)
			{
				if(x1[0]>x2[0])
				{
					return 1;
				}
				else
				{
					return -1;
				}
			}
		});
		
		String ans = "YES";
		
		for(int i=0; i<n; i++)
		{
			if(s<=a[i][0])
			{
				ans = "NO";
			}
			else
			{
				s = s + a[i][1];
			}
		}
		
		System.out.println(ans);
		
	}

}
