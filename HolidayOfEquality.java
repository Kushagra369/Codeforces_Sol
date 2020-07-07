import java.util.*;

public class HolidayOfEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		int max = 0;
		for(int i=0; i<n; i++)
		{
			int x = sc.nextInt();
			sum += x;
			if(x>max)
			{
				max = x;
			}
		}
		sc.close();
		
		int ans = (max*n) - sum;
		System.out.println(ans);
	}

}
