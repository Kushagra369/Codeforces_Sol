import java.util.*;
public class MinimalSquare {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int ans = 0;
			if(a>b)
			{
				ans = Math.max(a, b+b);
			}
			else
			{
				ans = Math.max(b, a+a);
			}
			
			System.out.println(ans*ans);
		}
		sc.close();
	}

}
