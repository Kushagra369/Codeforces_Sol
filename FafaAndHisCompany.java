import java.util.*;

public class FafaAndHisCompany {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int ans = 0;
		
		for(int i=1; i<=n; i++)
		{
			if((n-i)!=0 && (n-i)%i==0)
			{
				ans++;
			}
		}
		
		System.out.println(ans);
	}

}
