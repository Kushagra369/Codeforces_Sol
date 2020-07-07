import java.util.*;

public class Puzzles 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[m];
		
		for(int i=0; i<m; i++)
		{
			arr[i] = sc.nextInt();
		}
		sc.close();
		
		Arrays.sort(arr);
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<=(m-n); i++)
		{
			if(arr[i+n-1]-arr[i]<min)
			{
				min = arr[i+n-1]-arr[i];
			}
		}
		
		System.out.println(min);
	}
}
