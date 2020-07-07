import java.util.*;

public class IQTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		
		int one=0;
		int zero=0;
		
		for(int i=0;i<n; i++)
		{
			a[i] = (sc.nextInt()%2);
			if(a[i]==1)
			{
				one++;
			}
			else
			{
				zero++;
			}
		}
		sc.close();
		int count=0;
		if(one==1)
		{
			count = 1;
		}
		else if(zero==1)
		{
			count = 0;
		}
		
		for(int i=0; i<n; i++)
		{
			if(a[i]==count)
			{
				count = i+1;
				break;
			}
		}
		
		System.out.println(count);
		
	}

}
