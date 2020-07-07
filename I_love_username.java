import java.util.*;
public class I_love_username {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++)
		{
			a[i] = sc.nextInt();
		}
		sc.close();
		int min = a[0];
		int max = a[0];
		int c = 0;
		
		for(int i=1; i<n; i++)
		{
			if(a[i]<min)
			{
				c++;
				min = a[i];
			}
			else if(a[i]>max)
			{
				c++;
				max = a[i];
			}
		}
		
		System.out.println(c);
	}

}
