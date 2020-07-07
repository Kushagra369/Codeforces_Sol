import java.util.*;

public class BalancedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int z=0; z<t; z++)
		{
			int n = sc.nextInt();
			
			if((n/2)%2==1)
			{
				System.out.println("NO");
			}
			else
			{
				System.out.println("YES");
				int[] a = new int[n];
				int count=0;
				for(int i=0; i<n; i++)
				{
					if(i<(n/2))
					{
						a[i] = (i+1)*2;
					}
					else
					{
						if(i!=(n-1))
						{
							a[i] = a[i-(n/2)] - 1; 
							count++;
						}
						else
						{
							a[i] = a[i-(n/2)] + count; 
						}
					}
					
					System.out.print(a[i]+" ");
				}
			}
		}
		sc.close();
	}

}
